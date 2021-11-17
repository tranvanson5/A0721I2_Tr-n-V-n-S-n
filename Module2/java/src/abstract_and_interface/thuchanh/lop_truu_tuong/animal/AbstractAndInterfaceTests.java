package abstract_and_interface.thuchanh.lop_truu_tuong.animal;

import abstract_and_interface.thuchanh.lop_truu_tuong.edible.Edible;

public class AbstractAndInterfaceTests {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
