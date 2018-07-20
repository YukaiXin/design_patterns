package templateMethodPattern;


/**
 * Created by kxyu on 2018/7/20
 */
public abstract class Method {

    final void cooking(){

        pourOil();

        heatOil();

        pourVegetable();

        pourSauce();

        fry();
    }

    void pourOil(){

        Utils.println("1 倒油");
    }

    void heatOil(){
        Utils.println("2 热油");
    }

    abstract void pourVegetable();

    abstract void pourSauce();

    void fry(){
        Utils.println("5 翻炒");
    }
}
