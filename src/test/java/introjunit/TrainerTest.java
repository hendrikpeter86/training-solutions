package introjunit;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class TrainerTest {

    @Test
    void testCreate() {  //void, mert nem ad vissza semmit, működést ellenőriz
        //Given - példányosítás és inicializálás, állapotba helyezés
        Trainer trainer = new Trainer("John Doe");

        //When - műveletet hajtunk végre, aminek az eredményét ellenőriznénk
        String name = trainer.getName();

        //Then - ami visszajött név, tnyleg megegyezik-e azzal, amit vártunk
        assertThat(name, equalTo("John Doe"));
    }

    @Test
    void testCreate2(){
        assertThat(new Trainer("John Doe").getName(), equalTo("John Doe"));
    }

    @Test
    void testUppercase(){
        assertThat(new Trainer("John Doe").getNameUppercase(), equalTo("JOHN DOE"));

    }
}