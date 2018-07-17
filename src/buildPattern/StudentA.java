package buildPattern;

public class StudentA {

    private int id;
    private String name;
    private String passwd;
    private String sex;
    private String address;

    public StudentA(){

    }

    public StudentA(int id, String name, String passwd, String sex, String address) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.sex = sex;
        this.address = address;
    }

    /**
     * Student的创建完全依靠Student.Builder，使用一种方法链的方式来创建
     *
     */
    public static class Builder{

        private StudentA studentA;


        public Builder(){
             studentA = new StudentA();
        }

        public Builder ID(int id){
            studentA.id = id;
            return this;
        }

        public Builder Name(String name){
            studentA.name = name;
            return this;
        }

        public Builder Passwd(String passwd){
            studentA.passwd = passwd;
            return this;
        }

        public Builder Sex(String sex){
            studentA.sex = sex;
            return this;
        }

        public Builder Address(String address){
            studentA.address = address;
            return this;
        }

        public StudentA build(){
            return studentA;
        }

    }

}
