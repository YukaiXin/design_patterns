package chainOfResponsibility;

/**
 * Created by kxyu on 2018/8/2
 */
public class Manager implements Ratify {

    @Override
    public Result deal(Chain chain) throws CloneNotSupportedException {


        Request request = chain.request();
        System.out.println("Manager=====>request:" + request.toString());

        if (request.getDay() > 3) {
            // 包装新的Request对象
            Request newRequest = request.clone();
            newRequest.setManagerInfo(request.getName() + "每月的KPI考核还不错，可以批准");

            return chain.proceed(newRequest);
        }

        return new Result(true, "Manager：早点把事情办完，项目离不开你");
    }
}
