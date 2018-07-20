package templateMethodPattern;

/**
 * Created by kxyu on 2018/7/20
 */

//炒手撕包菜的类
public class ConcreteClass_CaiHua extends Method {

    @Override
    void pourVegetable() {
        Utils.println("3 倒入菜花");
    }

    @Override
    void pourSauce() {
        Utils.println("4 倒入盐");
    }
}
