package 结构型模式.组合模式;

class Programmer extends Employer {

    public Programmer(String name){
        setName(name);
        employers = null; //表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
