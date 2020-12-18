package methodstructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BodyMassTest {

    @Test
    public void bodyMassIndex(){
    BodyMass bmOver = new BodyMass(120,1.8);
    BodyMass bmUnder = new BodyMass(40,1.8);
    BodyMass bmNormal = new BodyMass(70,1.8);

    assertEquals(BmiCategory.OVERWEIGHT, bmOver.body());
    assertEquals(BmiCategory.UNDERWEIGHT, bmUnder.body());
    assertEquals(BmiCategory.NORMAL, bmNormal.body());
    }

}
