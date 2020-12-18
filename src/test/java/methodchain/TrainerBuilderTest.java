package methodchain;

import org.junit.jupiter.api.Test;

public class TrainerBuilderTest {
    
    @Test
    public void build(){
        TrainerBuilder trainerBuilder = new TrainerBuilder().withName("John Doe").withAge(30);
        Trainer trainer = trainerBuilder.build();

        assertThat(trainer.getName(), equalTo("John Doe"));
    }
}
