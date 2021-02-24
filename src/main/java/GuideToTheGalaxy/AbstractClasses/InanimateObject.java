package GuideToTheGalaxy.AbstractClasses;

import GuideToTheGalaxy.Enums.Size;

public abstract class InanimateObject {
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    private Size size;

    public InanimateObject(){
        this.size = null;
    }

    public InanimateObject(Size size){
        this.size = size;
    }
}
