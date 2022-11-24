public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Honey", 450, 15);
        Dog dog2 = new Dog("Bonny", 520, 8);
        Dog dog3 = new Dog("Sammy", 300, 10)
        Cat cat1 = new Cat("Sue", 680, 7);
        Cat cat2 = new Cat("Johnny", 80, 6);
        Cat cat3 = new Cat("Sheggy", 120, 5);

        Animal [] animals = {dog1, dog2, dog3, cat1, cat2, cat3};

        for (Animal animal : animals) {
            animal.printInfo();
        }

        System.out.println("Создано собак: %s%nСоздано кошек: %s%nВсего создано животных: %s%n", Dog.getDogCount(), Cat.getCatCount(), (Dog.getDogCount() + Cat.getCatCount()));
    }
}