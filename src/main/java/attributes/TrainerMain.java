package attributes;

import java.util.Arrays;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", true, Arrays.asList()); //itt hívjuk meg a konstruktort, példányosításkor kell megadni a paramétereket.
        System.out.println(trainer.getName());
        System.out.println(trainer.isActive());
        System.out.println(trainer.getTraining());
    }
}
