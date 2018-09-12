package 创建型模式.工厂模式;

/**
 *  定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。
 */
class Test {

    /**
     *  1.当一个类不知道它所必须创建的对象的类的时候。
     2.当一个类希望由它的子类来指定它所创建的对象的时候。
     3.当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
     * @param args
     */
    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWord();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWord();

        IWorkFactory teacherWorkFactory2 = new TeacherWorkFactory();
        System.out.println(teacherWorkFactory2.getWork());

        IWorkFactory teacherWorkFactory3 = new TeacherWorkFactory();
        System.out.println(teacherWorkFactory3.getWork());
    }
}
