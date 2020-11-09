package intromethods;

public class Trainer {

    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUppercase() {
        String nameUppercase = getName().toUpperCase();  //metódus meghívhat akár két másik metódust is
        return nameUppercase;
    }

    @Override
    public String toString() {
        return "Trainer: " + name;
    }

    public static void main(String[] args) {
        Trainer t = new Trainer("John Doe");
        System.out.println(t);
    }
}
