package chainOfResponsibility;

public class chainMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Request request = new Request.Builder().setName("Tim cook").setDepartment("HR D").setReason("事假").setDay(5).setCustomInfo(" 搬家 ").build();

        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);

        System.out.println("结果：" + result.toString());

    }
}
