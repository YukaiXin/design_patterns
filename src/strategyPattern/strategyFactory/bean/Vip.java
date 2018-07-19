package strategyPattern.strategyFactory.bean;


import strategyPattern.strategyFactory.PriceRegion;

/**
 * Created by kxyu on 2018/7/19
 */

@PriceRegion(min = 10000, max = 20000)
public class Vip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.75;
    }
}
