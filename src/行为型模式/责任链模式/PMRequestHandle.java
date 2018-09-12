package 行为型模式.责任链模式;



public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;

    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if(request instanceof AddMoneyRequest){
            System.out.println("要加薪,项目经理审批!");
        }else {
            rh.handleRequest(request);
        }
    }
}
