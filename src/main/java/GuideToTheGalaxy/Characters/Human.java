package GuideToTheGalaxy.Characters;

import GuideToTheGalaxy.AbstractClasses.LivingCreature;
import GuideToTheGalaxy.Enums.CelestialObject;
import GuideToTheGalaxy.Enums.Size;

public class Human extends LivingCreature {
    private String name;

    public Human(String name, CelestialObject homeland, Size size){
        super(homeland,size);
        this.name = name;
    }

    private boolean areEyesOpen = true;

    public boolean areEyesOpen() {
        return areEyesOpen;
    }

    public void blink() {
        areEyesOpen = !areEyesOpen;
    }

}
