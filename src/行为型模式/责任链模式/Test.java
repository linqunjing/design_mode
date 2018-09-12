package 行为型模式.责任链模式;

/**使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，
并沿着这条链传递该请求，直到有一个对象处理它为止。
这一模式的想法是，给多个对象处理一个请求的机会，从而解耦发送者和接受者.*/
public class Test {
    /**1.有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
    2.你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
    3.可处理一个请求的对象集合应被动态指定。*/
    public static void main(String[] args) {
        HRRequestHandle hr = new HRRequestHandle();
        PMRequestHandle pm = new PMRequestHandle(hr);
        TLRequestHandle tl = new TLRequestHandle(pm);

        //team leader处理离职请求
        Request request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("===========");
        //team leader处理加薪请求
        request = new AddMoneyRequest();
        tl.handleRequest(request);

        System.out.println("========");
        //项目经理上理辞职请求
        request = new DimissionRequest();
        pm.handleRequest(request);
    }
}
