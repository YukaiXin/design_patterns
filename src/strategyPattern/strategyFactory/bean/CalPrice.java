package strategyPattern.strategyFactory.bean;

/**
 * Created by kxyu on 2018/7/19
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double orgnicPrice);
}
