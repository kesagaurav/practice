import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B extends Gaurav {

	public void hello() {
		System.out.println("hi i am in subclass B");
	}
	private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }
      
   
    private void readObject(ObjectInputStream in) throws IOException
    {
        throw new NotSerializableException();
    }
	
}
