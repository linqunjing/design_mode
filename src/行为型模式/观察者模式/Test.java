package 行为型模式.观察者模式;

/**
 * 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。
 */
public class Test {
    /**
     * 1.当一个抽象模型有两个方面,其中一个方面依赖于另一方面。
     将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
     2.当对一个对象的改变需要同时改变其它对象,而不知道具体有多少对象有待改变。
     3.当一个对象必须通知其它对象，而它又不能假定其它对象是谁。
     * @param args
     */
    public static void main(String[] args) {
        FuTianPoliceman ftPol = new FuTianPoliceman();
        LongHuaPoliceman lhPol = new LongHuaPoliceman();

        Citizen citizen = new FuTianCitizen(ftPol);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("==========================");

        citizen = new LongHuaCitizen(lhPol);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }
}
