package 行为型模式.策略模式;

class Context {

    Strategy stra;

    public Context(Strategy stra) {
        this.stra = stra;
    }

    public void doMethod(){
        stra.method();
    }
}
