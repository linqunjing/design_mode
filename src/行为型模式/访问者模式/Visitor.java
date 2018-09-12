package 行为型模式.访问者模式;

import java.util.Collection;

interface Visitor {

    public void visitString(StringElement stringE);

    public void visitFloat(FloatElement floatE);

    public void visitCollection(Collection collection);
}
