package 创建型模式.工厂模式;

class Test {
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
