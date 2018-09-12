package 结构型模式.外观模式;

 class Test {

     public static void main(String[] args) {
         ServiceA sa = new ServiceAImpl();
         ServiceB sb = new ServiceBImpl();

         sa.methodA();
         sb.methodB();

         System.out.println("======================");

         Facade facade = new Facade();
         facade.methodA();
         facade.methodB();
     }

}
