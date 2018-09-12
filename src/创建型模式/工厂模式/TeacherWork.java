package 创建型模式.工厂模式;

 class TeacherWork implements Work {
    @Override
    public void doWord() {
        System.out.println("老师审批作业!");
    }
}
