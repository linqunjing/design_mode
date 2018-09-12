package 行为型模式.访问者模式;

interface Visitable {
    public void accept(Visitor visitor);
}
