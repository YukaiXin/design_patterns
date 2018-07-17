package proxyPattern.Bean;


/**
 * Created by kxyu on 2018/7/16
 */

public class CivilianA extends Civilian {


    @Override public void submit() {
        System.out.print("CivilianA submit \n");
    }

    @Override public void burden() {
        System.out.print("CivilianA burden \n");

    }

    @Override public void defend() {
        System.out.print("CivilianA defend \n");

    }

    @Override public void finish() {
        System.out.print("CivilianA finish \n");

    }
}
