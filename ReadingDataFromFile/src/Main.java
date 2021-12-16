import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\java programs by vinay sir practice\\ReadingDataFromFile\\src\\gaurav.txt");
		int data;

		while ((data = fis.read()) != -1) {
			System.out.println("\n data  " + data + "\t " + (char) data);
		}
		fis.close();
	}

}
