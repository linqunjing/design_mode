package 创建型模式.单例模式;

class Test {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing);
        System.out.println(sing2);
    }
}
