package GuideToTheGalaxy.Characters;

import GuideToTheGalaxy.AbstractClasses.LivingCreature;
import GuideToTheGalaxy.Enums.CelestialObject;
import GuideToTheGalaxy.Enums.Size;

public class Alien extends LivingCreature {
    private String name;

    public Alien(String name, CelestialObject homeland, Size size){
        super(homeland,size);
        this.name = name;
    }
}
