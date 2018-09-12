package 行为型模式.解释器模式;

public class SimpleExpression extends Expression {
    @Override
    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}
