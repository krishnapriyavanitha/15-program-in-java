interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat is eating insects.");
    }

    public void fly() {
        System.out.println("Bat is flying.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
