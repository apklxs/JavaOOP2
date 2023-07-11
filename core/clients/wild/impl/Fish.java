import java.time.LocalDate;

import OOP.core.clients.Flyable;
import OOP.core.clients.Runnable;
import OOP.core.clients.owners.Owner;
import OOP.core.clients.wild.WildAnimal;

public class Fish extends WildAnimal implements Swimable {
    public Fish() {
    }

    public Fish(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public void swimAble(String animal){
        System.out.printf("s% может плавать", animal);
    };

}
