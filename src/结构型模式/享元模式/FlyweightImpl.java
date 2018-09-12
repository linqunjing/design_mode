package 结构型模式.享元模式;

class FlyweightImpl implements Flyweight {
    @Override
    public void action(int arg) {
        System.out.println("参数值:"+ arg);
    }
}
