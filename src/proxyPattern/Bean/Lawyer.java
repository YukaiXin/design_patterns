package proxyPattern.Bean;


/**
 * Created by kxyu on 2018/7/16
 */

public class Lawyer implements ILawsuit {

    private ILawsuit cicilian;

    public Lawyer(ILawsuit cicilian) {
        this.cicilian = cicilian;
    }

    @Override
    public void submit() {
        cicilian.submit();
    }

    @Override
    public void burden() {
        cicilian.burden();
    }

    @Override
    public void defend() {
        cicilian.defend();
    }

    @Override
    public void finish() {
        cicilian.finish();
    }
}
