package org.example.person.referee;

import org.example.person.Person;

public class Referee extends  Person {

public final String Category;

    public Referee(String personID, String name, String surname, String dateOfBirth, String category) {
        super(personID, name, surname, dateOfBirth);
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    @Override
    public String toString() {
        return "Referee{" +
                ", personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "Category='" + Category + '\'' +
                '}';
    }
}
