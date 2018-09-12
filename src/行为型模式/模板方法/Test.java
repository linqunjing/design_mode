package 行为型模式.模板方法;

/**
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 TemplateMethod使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Test {

    /**
     *  1.一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
     2.各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。
     首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。
     最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。
     3.控制子类扩展。
     * @param args
     */
    public static void main(String[] args) {
        Template temp = new TemplateConcrete();
        temp.update();
    }
}
