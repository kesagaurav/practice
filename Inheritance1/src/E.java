import java.io.FileNotFoundException;
import java.io.IOException;

public class E {

	public void show2() throws Exception{
		System.out.println("\n i i ma in parent class");
	}

	// if we give the same parent class exception first it will look for the subclass otherwise it will give error
	// anthor thnig while usng exceptins in subclasss we have should keep in mind that the subclass exceptions will
	// not be used if we use the compiler will give an error
}
