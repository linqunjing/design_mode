package 结构型模式.装饰者模式;

public class ManDecoratorA extends Decorator {

    public void eat(){
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("再吃一碗饭");
    }
}
