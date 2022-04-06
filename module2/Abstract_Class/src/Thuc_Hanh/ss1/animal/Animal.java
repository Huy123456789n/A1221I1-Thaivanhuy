package Thuc_Hanh.ss1.animal;

public abstract class  Animal {
    public abstract String makesound();
}

class Chicken extends Animal implements edible {
    @Override
    public String makesound() {
        return "Chicken: Cluck- cluck";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}

class Tiger extends Animal {
    @Override
    public String makesound() {
        return "Tiger: roarrrr";
    }
}

class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makesound();
            System.out.println(animal.makesound());
            if (animal instanceof Chicken) {
                edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }
    }
}
interface edible {
    String howtoEat();
}





