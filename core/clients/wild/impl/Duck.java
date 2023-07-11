package OOP.core.clients.wild.impl;

import java.time.LocalDate;

import OOP.core.clients.Flyable;
import OOP.core.clients.Runnable;
import OOP.core.clients.owners.Owner;
import OOP.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + "летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 3 км/ч");
        return 3;
    }

    @Override
    public void runAble(String animal){
        System.out.printf("s% может бегать", animal);
    };

    @Override
    public void flyAble(String animal){
        System.out.printf("s% может летать", animal);
    };

}
