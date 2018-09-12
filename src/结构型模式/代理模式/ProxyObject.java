package 结构型模式.代理模式;


class ProxyObject implements Object {
    Object obj;

    public ProxyObject() {
        System.out.println("这是代理类");
        obj = new ObjectImpl();
    }

    @Override
    public void action(){
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
}
