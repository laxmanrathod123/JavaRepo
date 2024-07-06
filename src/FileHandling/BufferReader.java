package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {


	public static void main(String[] args) throws IOException  {

		File f= new File("C:\\Users\\hp\\Desktop\\TestData.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s=br.readLine();
		
		// null is the end of the file
		while(s!=null) {
			System.out.println(s);
            s=br.readLine();			
		}
		
		
	}

}
