package GuideToTheGalaxy.AbstractClasses;

import GuideToTheGalaxy.Enums.CelestialObject;
import GuideToTheGalaxy.Enums.Size;

public abstract class LivingCreature {
    private final CelestialObject homeland;
    private InanimateObject holdObj = null;
    private final Size size;

    public Size getSize() {
        return size;
    }


    public LivingCreature(){
        this. homeland = null;
        this.size = null;
    }

    public LivingCreature(CelestialObject homeland, Size size){
        this. homeland = homeland;
        this.size = size;
    }

    public boolean takeSmth(InanimateObject obj){
        if (holdObj == null){
            if ( obj.getSize().getNumSize() < this.size.getNumSize()){
                holdObj = obj;
                return true;
            }else{
                System.out.println("This object is too big to hold it.");
                return false;
            }
        }else{
            System.out.println("This creature holds smth already.");
            return false;
        }
    }

    public boolean doesHoldSmth(){
        return !(holdObj == null);
    }

}
