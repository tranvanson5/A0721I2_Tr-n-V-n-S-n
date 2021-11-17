package abstract_and_interface.thuchanh.lop_truu_tuong.animal;

import abstract_and_interface.thuchanh.lop_truu_tuong.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}