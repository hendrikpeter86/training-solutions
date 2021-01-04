package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPresent(){
        Random rnd = new Random();
        if(age>14){
            present = Present.values()[rnd.nextInt(Present.values().length-1)+1];
        }else{
            present = Present.values()[rnd.nextInt(Present.values().length)];
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }
}
