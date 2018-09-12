package 行为型模式.解释器模式;

abstract class Expression {
    abstract void interpret(Context ctx);
}
