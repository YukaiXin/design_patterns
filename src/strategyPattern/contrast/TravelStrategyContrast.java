package strategyPattern.contrast;

/**
 * Created by kxyu on 2018/7/19
 */
public class TravelStrategyContrast {


    private StrategyEM strategy;

    public enum StrategyEM{
        WALK, PLANE, TRAIN
    }

    public TravelStrategyContrast(StrategyEM strategy) {
        this.strategy = strategy;
    }

    public void travel(){
        if(strategy==StrategyEM.WALK){
            print("walk");
        }else if(strategy==StrategyEM.PLANE){
            print("plane");
        }else if(strategy==StrategyEM.TRAIN){
            print("train");
        }
    }

    public void print(String str){
        System.out.println("出行旅游的方式为："+str);
    }

}
