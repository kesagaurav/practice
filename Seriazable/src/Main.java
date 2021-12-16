import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaurav g = new Gaurav();
		g.setId(1);
		g.setName("gaurav");
		g.setSalarly("20000");
		System.out.println(g);
		B b = new B();
		b.hello();
		
		List<Gaurav> gaurav=new ArrayList<>();
		gaurav.add(new Gaurav(1,"gaurav","20000"));
		gaurav.add(new Gaurav(2,"sdnjs","22000"));
		gaurav.add(new Gaurav(3,"sdnjsd","10000"));
		gaurav.add(new Gaurav(4,"sjoiajiao","23000"));
		gaurav.add(new Gaurav(5,"gaurav3","29000"));
		System.out.println(gaurav);
		
		try {
			FileOutputStream fs=new FileOutputStream("D:\\gaurav.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(gaurav);
			fs.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream fs;
		try {
			fs = new FileInputStream("D:\\gaurav.ser");
			ObjectInputStream os=new ObjectInputStream(fs);
		List<Gaurav> g1=(List<Gaurav>) os.readObject();
			System.out.println("\n printing the elments are");
			g1.forEach(System.out::println);
			fs.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
