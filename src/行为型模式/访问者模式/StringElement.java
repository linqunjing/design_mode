package 行为型模式.访问者模式;

class StringElement implements Visitable {
    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return se;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
