package 结构型模式.装饰者模式;

abstract class Decorator implements Person {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
