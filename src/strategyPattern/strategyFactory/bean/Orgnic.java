package strategyPattern.strategyFactory.bean;


import strategyPattern.strategyFactory.PriceRegion;

/**
 * Created by kxyu on 2018/7/19
 */
@PriceRegion(max = 10000)
public class Orgnic implements CalPrice {

    @Override
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
