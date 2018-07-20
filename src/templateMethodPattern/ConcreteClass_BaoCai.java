package templateMethodPattern;

/**
 * Created by kxyu on 2018/7/20
 */

//炒手撕包菜的类
public class ConcreteClass_BaoCai extends Method {

    @Override
    void pourVegetable() {
        Utils.println("3 倒入大头菜");
    }

    @Override
    void pourSauce() {
        Utils.println("4 倒入辣椒段");
    }
}
