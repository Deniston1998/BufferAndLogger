package basee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="Usingbuffer.txt";
		FileReader fileReader = new FileReader(location);
		 
		 BufferedReader bufferedReader = new BufferedReader(fileReader);
		 //method
		String currentline;
		while((currentline=bufferedReader.readLine())!=null) {
			System.out.println(currentline);
		}
		
		 
	}

}
