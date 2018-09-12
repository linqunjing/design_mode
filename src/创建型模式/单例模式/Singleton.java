package 创建型模式.单例模式;

class Singleton {
    private static Singleton sing;

    private Singleton(){
    };

    public static Singleton getInstance(){
        if(sing == null){
            sing = new Singleton();
        }
        return sing;
    }
}
