public interface  Car {

    public void installEngine200();

    public void installEngine300();
}


public class Bwm implements Car {

    @Override
    public void installEngine200() {
        System.out.println("Bwm车组装Engine200");
    }

    @Override
    public void installEngine300() {
        System.out.println("Bwm车组装Engine300");      
    }
}


public class Bwm implements Car {

    @Override
    public void installEngine200() {
        System.out.println("Bwm车组装Engine200");
    }

    @Override
    public void installEngine300() {
        System.out.println("Bwm车组装Engine300");      
    }
}


public class Client {

    public static void main(String[] args) {
        //奔驰车安装200引擎
        Car benz=new Benz();
        benz.installEngine200();
        //宝马车安装300引擎
        Car bwm=new Bwm();
        bwm.installEngine300();
    }
}