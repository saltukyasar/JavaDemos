package com.company;
class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("hayvan konusuyor...");
    }


}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" kus otuyor..");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+"havlıyo...");
    }
}
class Horse extends Animal{
    public Horse(String name)
    {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println(getName()+"kisniyo...");
    }
}



public class Main {


    public static void main(String[] args) {

        Animal animal= new Animal("hayvan");
        Bird bird = new Bird("limon");
        Dog dog = new Dog("karabas");
        Horse horse =new Horse("sahbatuer");

        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();

    }
}
