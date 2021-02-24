import static org.junit.jupiter.api.Assertions.*;
import GuideToTheGalaxy.AuxillaryEquipment.Utensils;
import GuideToTheGalaxy.Characters.Alien;
import GuideToTheGalaxy.Characters.Fish;
import GuideToTheGalaxy.Characters.Human;
import GuideToTheGalaxy.Enums.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GuideToTheGalaxyTest {
    Alien ford;
    Human arthur;
    Fish fish;
    Utensils bottle;

    @BeforeEach
    void setUp() {
        ford = new Alien("Ford", CelestialObject.Betelgeuse, Size.Large);
        arthur = new Human("Arthur", CelestialObject.Earth, Size.Large);
        bottle = new Utensils(Size.Medium, Material.Glass, UtensilsType.Bottle);
        fish = new Fish(Size.Small, CelestialObject.Earth, Color.Gold);
    }

    @AfterEach
    void tearDown() {
        ford = null;
        arthur = null;
        fish = null;
        bottle = null;
    }

    @Test
    void testLogic() {
        assertFalse(bottle.doesContainSomeone());
        bottle.putSomeoneInside(ford);
        assertFalse(bottle.doesContainSomeone());
        bottle.putSomeoneInside(fish);
        assertTrue(bottle.doesContainSomeone());

        assertTrue(arthur.areEyesOpen());
        arthur.blink();
        assertFalse(arthur.areEyesOpen());

        assertFalse(ford.doesHoldSmth());
        ford.takeSmth(bottle);
        assertTrue(ford.doesHoldSmth());
    }
}
