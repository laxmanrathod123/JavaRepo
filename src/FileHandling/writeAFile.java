package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeAFile {

	public void filewrite(String data) throws IOException {
		
		File f= new File("C:\\Users\\hp\\Desktop\\filewriting.txt");
		FileWriter fw= new FileWriter(f,true);
		fw.write(data);
		fw.flush();
		fw.close();
		
	}
	public void bufferedwriter(String data) throws IOException {
		
		File f1= new File("C:\\\\Users\\\\hp\\\\Desktop\\\\filewriting.txt");
		FileWriter fw1= new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw1);
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
		writeAFile obj= new writeAFile();
		obj.filewrite("\n I am passing the data through run time infile");
		obj.filewrite("\n Hellow world");
	     obj.bufferedwriter("Here i am again writing");	
	
		
	}

}
