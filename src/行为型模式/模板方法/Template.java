package 行为型模式.模板方法;

public abstract class Template {

    public abstract void point();

    public void update(){
        System.out.println("开始打印");
        for (int i = 0; i < 10; i++) {
            point();
        }
    }
}
