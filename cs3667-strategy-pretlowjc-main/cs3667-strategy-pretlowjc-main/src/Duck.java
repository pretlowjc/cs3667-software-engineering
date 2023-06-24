
public class Duck {
    private String name;

    public Duck(String name) {
	this.name = name;
    }

    public void display() {
	System.out.println("I'm a duck named " + name + ".");
    }

    public void fly() {
	System.out.println("" + name + " is flying!!");
    }

    public void quack() {
	System.out.println("" + name + " says Quack.");
    }

    public void swim() {
	System.out.println("" + name + "'s webbed feet a paddlin'...");
    }
}
