package 创建型模式.单例模式;

/**
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 */
class Test {
    /**
     * 1.当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。
     2.当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。
     * @param args
     */
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing);
        System.out.println(sing2);
    }
}
