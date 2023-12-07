package homework_Dog;

public class Main {
    public static void main(String[] args) {
        /* Task 1
        Создать класс Dog c полями name, counter и конструктором.
        Cоздать несколько обьектов этого класса и вывести на печать количество созданных обьектов.
         */

        Dog d1 = new Dog("Bob", "Bobtail");
        Dog d2 = new Dog("Frog", "Bulldog");
        Dog d3 = new Dog("Mona", "Collie");
        Dog d4 = new Dog("Bucks", "Bulldog");

        System.out.println("There are " + Dog.counter+ " dogs in our club.");

        Dog [] dogs = {d1,d2,d3,d4};
       /* for (Dog dog : dogs)
        { System.out.println(dog); }
        */
        for (int i=0, j=1; i< dogs.length; i++, j++)
            System.out.println(j+ ". "+ dogs [i]);
}}
