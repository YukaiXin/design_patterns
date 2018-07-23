package bridgePattern.contrast;

import bridgePattern.Circle;
import bridgePattern.DrawAPI;
import bridgePattern.GreenCircle;
import bridgePattern.RedCircle;

public class carMain {

    public static void main(String[] args) {

        Benz benz = new Benz(new EngineV10());
        benz.installEngine();

        Bwm bwm   = new Bwm(new EngineV8());
        bwm.installEngine();

    }
}
