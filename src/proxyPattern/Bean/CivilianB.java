package proxyPattern.Bean;



/**
 * Created by kxyu on 2018/7/16
 */

public class CivilianB implements ILawsuit {
    @Override
    public void submit() {
        System.out.print("CivilianB submit \n");
    }

    @Override
    public void burden() {
        System.out.print("CivilianB burden \n");
    }

    @Override
    public void defend() {
        System.out.print("CivilianB defend \n");
    }

    @Override
    public void finish() {
        System.out.print("CivilianB finish \n");
    }

}
