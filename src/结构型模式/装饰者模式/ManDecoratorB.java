package 结构型模式.装饰者模式;

class ManDecoratorB extends Decorator {

    public void eat(){
        super.eat();
        System.out.println("=====================");
        System.out.println("ManDecoratorB类");
    }
}
