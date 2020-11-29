package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void testSayHello(){
    Gentleman gentleman = new Gentleman();
    String koszones = gentleman.sayHello("Peti");
    assertEquals ("Hello Peti", koszones);
        }
    }
