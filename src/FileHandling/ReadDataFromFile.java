package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException {

		File f= new File("C:\\Users\\hp\\Desktop\\TestData.txt");
		FileReader fr= new FileReader(f);
		int i=fr.read();  // The data in the file is ascii value so its reading into the integer format
		// -1 is the end of the file
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}

}

