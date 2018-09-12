package 行为型模式.解释器模式;

class AdvanceExpression extends Expression {

    @Override
    void interpret(Context ctx) {
        System.out.println("这是高级解析器");
    }
}
