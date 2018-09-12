package 行为型模式.模板方法;

public class TemplateConcrete extends Template {

    @Override
    public void point() {
        System.out.println("这是子类的实现");
    }
}
