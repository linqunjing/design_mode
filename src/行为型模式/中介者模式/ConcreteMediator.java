package 行为型模式.中介者模式;

class ConcreteMediator extends Mediator {

    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if(content.equals("boss")){
            cb.action();
        }
        if(content.equals("client")){
            ca.action();
        }
    }
}
