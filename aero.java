


//human
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
    void walk() {
        System.out.println("Animal is walking");
    }
}
//animal
class Human extends Animal {
    void eat() {
        System.out.println("Human is eating");
    }
    void sleep() {
        System.out.println("Human is sleeping");
    }
    void walk() {
        System.out.println("Human is walking");
    }
} 

public class aero{
    public static void main(String arr[]){
        Animal or= new Animal();
        or.eat();
        or.sleep();
        or.walk();
        Human ou=new Human();
        ou.walk();
        ou.eat();
    }
}
