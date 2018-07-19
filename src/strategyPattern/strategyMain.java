package strategyPattern;

import strategyPattern.contrast.TravelStrategyContrast;

public class strategyMain {

    public static void main(String[] args) {

        //对比
        TravelStrategyContrast strategy1 = new TravelStrategyContrast(TravelStrategyContrast.StrategyEM.WALK);
        strategy1.travel();

        TravelStrategyContrast strategy2 = new TravelStrategyContrast(TravelStrategyContrast.StrategyEM.WALK);
        strategy2.travel();

        //
        TravelContext travelContext = new TravelContext();
        travelContext.setStrategy(new PlaneStrategy());
        travelContext.travel();

        travelContext.setStrategy(new WalkStrategy());
        travelContext.travel();


    }
}
