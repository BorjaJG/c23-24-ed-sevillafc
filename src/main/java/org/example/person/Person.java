package org.example.person;

public class Person {

    public final String personID ;
    public final String name;
    public final String surname;
    public final String dateOfBirth;

    public Person(String personID, String name, String surname, String dateOfBirth) {
        this.personID = personID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
