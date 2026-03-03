package mypackage;

interface MyInterface {
    void showMessage();
}

class MyClass implements MyInterface {
    public void showMessage() {
        System.out.println("Hello! This is a user-defined package and interface example.");
    }
}

public class MainApp {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}
