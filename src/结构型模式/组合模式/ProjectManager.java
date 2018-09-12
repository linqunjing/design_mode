package 结构型模式.组合模式;

import java.util.ArrayList;

class ProjectManager extends Employer {

    public ProjectManager(String name){
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
