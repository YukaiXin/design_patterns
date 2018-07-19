package strategyPattern.strategyFactory;

/**
 * Created by kxyu on 2018/7/19
 */
public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.buy(15000d);

        System.out.println(player.calLastAmount());
    }
}
