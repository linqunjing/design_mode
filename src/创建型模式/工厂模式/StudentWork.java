package 创建型模式.工厂模式;

 class StudentWork implements Work {

    @Override
    public void doWord() {
        System.out.println("学生做作业!");
    }
}
