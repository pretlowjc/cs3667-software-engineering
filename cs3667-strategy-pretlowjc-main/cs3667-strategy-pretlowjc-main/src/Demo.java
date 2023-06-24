
public class Demo {
 
    public static void main(String[] args) {
 
	Duck	george = new Duck("George");
	Duck	martha = new Duck("Martha");

	george.display();
	george.quack();
	george.fly();	
	george.swim();

	martha.display();
	martha.quack();
	martha.fly();	
	martha.swim();
    }
}
