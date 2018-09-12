package 结构型模式.组合模式;

import java.util.List;

class Test {

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
