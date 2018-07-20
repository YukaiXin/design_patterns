package templateMethodPattern;

public class templateMethodMain {

    public static void main(String[] args) {

        Method baoCai = new ConcreteClass_BaoCai();
        baoCai.cooking();

        Utils.println("\n");

        ConcreteClass_CaiHua caiHua = new ConcreteClass_CaiHua();
        caiHua.cooking();



    }
}
