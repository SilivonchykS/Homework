package classwork.lesson_39.example_01;

public class Main1 {
    public static void checkOnPet(Pet pet){
        if (pet instanceof Dog){
            System.out.println("Your dog is fine!");
        }
        if (pet instanceof Cat){
            System.out.println("Your cat is fine!");
        }
        pet.makeSound();
    }
    public static void main(String[] args) {
       /* Pet dog=new Dog("Bobik",1,5, "Cream", "Golden retriever");
        Pet cat=new Cat("Barsik",1,3,"Black", "Bombay");
        System.out.println(dog);
        System.out.println(cat);
dog.makeSound();
cat.makeSound();*/
        Pet pet1=new Dog("Bobik",1,5, "Cream", "Golden retriever");
        Pet pet2=new Cat("Barsik",1,3,"Black", "Bombay");
        Pet pet=new Pet("Barsik",1,3,"Black");

        if (pet instanceof Dog) {//pet yavlaetsya sobakoy
            Dog dog=(Dog) pet;
            dog.makeSound();

        }

      /*  Object obj=new Object();
        System.out.println(obj);*/
        }
    }

