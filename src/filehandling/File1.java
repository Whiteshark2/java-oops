package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File f =new File("Hello");
		FileWriter c = new FileWriter("Hello");
		c.write("Hello world");
		
		c.close();
		
		
		
	}
		
	}


