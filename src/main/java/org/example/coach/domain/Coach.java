package org.example.coach.domain;

import org.example.person.domain.Person;

public class Coach extends Person {

   public final  String Strategy;


    public Coach(String personID, String name, String surname, String dateOfBirth, String strategy) {
        super(personID, name, surname, dateOfBirth);
        Strategy = strategy;
    }

    public String getStrategy() {
        return Strategy;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "Strategy='" + Strategy + '\'' +
                ", personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
