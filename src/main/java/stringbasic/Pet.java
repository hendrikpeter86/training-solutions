package stringbasic;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String registraionNumber;

    public Pet(String name, LocalDate dateOfBirth, Gender gender, String registraionNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.registraionNumber = registraionNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public Gender getGender() {
        return gender;
    }


    public String getRegistraionNumber() {
        return registraionNumber;
    }

}
