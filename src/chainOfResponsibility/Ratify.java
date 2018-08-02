package chainOfResponsibility;

/**
 * Created by kxyu on 2018/8/2
 */
public interface Ratify {

    // 处理请求
    public Result deal(Chain chain) throws CloneNotSupportedException;

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request) throws CloneNotSupportedException;

    }
}
