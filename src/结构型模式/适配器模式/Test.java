package 结构型模式.适配器模式;

/**
 * 将一个类的接口转换成客户希望的另外一个接口。
 * Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
class Test {

    /**
     *  1.你想使用一个已经存在的类，而它的接口不符合你的需求。
     2.你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口
     可能不一定兼容的类）协同工作。
     3.（仅适用于对象Adapter）你想使用一些已经存在的子类，但不可能对每一个都进行
     子类化以匹配它们的接口。对象适配器可以适配它的父类接口。
     * @param args
     */
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}
