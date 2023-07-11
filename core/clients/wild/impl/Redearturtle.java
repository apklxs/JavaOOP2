

import java.time.LocalDate;

import OOP.core.clients.Flyable;
import OOP.core.clients.Runnable;
import OOP.core.clients.owners.Owner;
import OOP.core.clients.wild.WildAnimal;

public class Redearturtle extends WildAnimal implements Swimable, Runnable {
    public Redearturtle() {
    }

    public Redearturtle(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + "ходит со скоростью: 2 км/ч");
        return 2;
    }

    @Override
    public void runAble(String animal){
        System.out.printf("s% может бегать", animal);
    };

    @Override
    public void swimAble(String animal){
        System.out.printf("s% может плавать", animal);
    };

}
