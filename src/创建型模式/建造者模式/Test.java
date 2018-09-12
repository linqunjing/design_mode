package 创建型模式.建造者模式;

/**
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
 class Test {

    /**
     *  1.当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
     2.当构造过程必须允许被构造的对象有不同的表示时。
     * @param args
     */
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
