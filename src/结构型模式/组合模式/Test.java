package 结构型模式.组合模式;

import java.util.List;

/**
 * 将对象组合成树形结构以表示"部分-整体"的层次结构。"Composite使得用户对单个对象和组合对象的使用具有一致性。"
 */
class Test {
    /**
     *  1.你想表示对象的部分-整体层次结构。
     2.你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
     * @param args
     */
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager("项目经理");
        ProjectAssistant pa = new ProjectAssistant("项目助理");
        Programmer programmer1 = new Programmer("程序员一");
        Programmer programmer2 = new Programmer("程序员二");

        pm.add(pa);
        pm.add(programmer2);

        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
