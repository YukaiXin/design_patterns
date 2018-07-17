package observerPattern;

/**
 * Created by kxyu on 2018/7/17
 */
public class ObserverMain {

    public static void main(String[] args) {

        Observable<Weather> observable=new Observable<Weather>();

        Observer<Weather> observer1 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {

                System.out.println("观察者1："+ data.toString());
            }
        };

        Observer<Weather> observer2 = new Observer<Weather>() {
            @Override
            public void onUpdate(Observable<Weather> observable, Weather data) {
                System.out.println("观察者2："+ data.toString());
            }
        };


        observable.register(observer1);
        observable.register(observer2);

        Weather weather1 = new Weather("多云转晴");
        observable.notifyObservers(weather1);

        weather1.setDescription("晴");

        observable.notifyObservers(weather1);
//        Weather weather=new Weather("多云转阴");
//        observable.notifyObservers(weather);

        observable.unregister(observer1);
//
//        Weather weather2=new Weather("台风");
//        observable.notifyObservers(weather2);
    }
}
