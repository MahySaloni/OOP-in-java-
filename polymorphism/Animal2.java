public class Animal2 {
    private String name;
    public Animal2(String name) {
        this.name = name;
    }
    public String sound() {
        return null;
    }
    public String toString() {
        return name.concat(" says ").concat(sound());
    }

}

class Dog extends Animal2 {
    public Dog(String name) {
        super(name);
    }

    public String sound() {
        return "Woof";
    }
}

class Cat extends Animal2 {
    public Cat(String name){
        super(name);
    }
    public String sound() {
        return "Meow";
    }
}

class Cow extends Animal2 {
    public Cow(String name){
        super(name);
    }
    public String sound() {
        return "Moo";
    }
}