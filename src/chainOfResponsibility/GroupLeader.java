package chainOfResponsibility;

/**
 * Created by kxyu on 2018/8/2
 */
public class GroupLeader implements Ratify {

    @Override
    public Result deal(Chain chain) throws CloneNotSupportedException {


        Request request = chain.request();
        System.out.println("GroupLeader=====>request:" + request.toString());

        if (request.getDay() > 1) {
            // 包装新的Request对象
            Request newRequest = request.clone();
            newRequest.setGroupLeaderInfo("request.name() + \"平时表现不错，而且现在项目也不忙\"");

            return chain.proceed(newRequest);
        }

        return new Result(true, "GroupLeader：早去早回");
    }
}
