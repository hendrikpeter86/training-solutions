package training;

public class trainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setYearOfBirth(1980);
        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.setName("Jack Doe");
        anotherTrainer.setYearOfBirth(1986);
        System.out.println(anotherTrainer.getName());

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getNameAndYearOfBirth());

        anotherTrainer.changeName( "Joe Ló");
        System.out.println(anotherTrainer.getName());

        anotherTrainer.setName("Jack Lóó");
        System.out.println(anotherTrainer.getName());
    }
}
