package GuideToTheGalaxy.Characters;

import GuideToTheGalaxy.AbstractClasses.LivingCreature;
import GuideToTheGalaxy.Enums.CelestialObject;
import GuideToTheGalaxy.Enums.Color;
import GuideToTheGalaxy.Enums.Size;

public class Fish extends LivingCreature {
    private Color color;

    public Fish (Size size, CelestialObject obj, Color color){
        super(obj, size);
        this.color = color;
    }
}
