package 创建型模式.建造者模式;

class PersonDirector {

    public Person constructPerson(PersonBuilder pb){
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
