package GuideToTheGalaxy.AuxillaryEquipment;

import GuideToTheGalaxy.AbstractClasses.InanimateObject;
import GuideToTheGalaxy.AbstractClasses.LivingCreature;
import GuideToTheGalaxy.Enums.Material;
import GuideToTheGalaxy.Enums.Size;
import GuideToTheGalaxy.Enums.UtensilsType;

public class Utensils extends InanimateObject {
    private Material material;
    private UtensilsType type;
    //private boolean doesContainSomeone = false;
    private LivingCreature insideCreature = null;

    public Utensils(Size size, Material material, UtensilsType type) {
        super(size);
        this.material = material;
        this.type = type;
    }

    public boolean doesContainSomeone(){
        return !(insideCreature == null);
    }

    public boolean putSomeoneInside(LivingCreature creature) {
        if (!doesContainSomeone()) {
            if (this.getSize().getNumSize() >= creature.getSize().getNumSize()) {
                insideCreature = creature;
                return true;
            }else{
                System.out.println("This object is big enough.");
                return false;
            }
        } else {
            System.out.println("This object already contains someone.");
            return false;
        }
    }
}
