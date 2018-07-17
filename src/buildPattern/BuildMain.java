package buildPattern;

public class BuildMain {

    public static void main(String[] args) {

        StudentA studentA = new StudentA.Builder().Address("shanghai").ID(777).Name("lucy").Passwd("11111").Sex("male").build();


        StudentB studentB = new StudentB("Tim", "22222", "male", "北京");


    }
}
