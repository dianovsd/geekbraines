package sample1;

import sample1.Animal;
import sample1.Cat;
import sample1.Dog;

public class Program {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setColor("Рыжий");
        cat1.jump();

        Dog dog1 = new Dog();

        Animal cat2 = new Cat();
        cat2.jump();

        Animal[] animals = new Animal[2];
        animals[0] = cat1;
        animals[1] = dog1;

        processVoice(animals);




    }

    public static void processVoice( Animal[] animals){
        for (int i = 0; i < animals.length; i++){
            animals[i].voice();

            if (animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                System.out.println(cat.getColor());

                Animal animal = cat;
                Object obj =  animal;

            }


        }

    }

}
