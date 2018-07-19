package strategyPattern.strategyFactory.bean;


import strategyPattern.strategyFactory.PriceRegion;

/**
 * Created by kxyu on 2018/7/19
 */

@PriceRegion(min = 20000, max = 30000)
public class SuperVip implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.5;
    }
}
