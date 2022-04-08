package basee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="UsingFileoutput.txt";
		 String content="Learne";
FileOutputStream outputStream = new FileOutputStream(location);
byte[] writeThis = content.getBytes();
outputStream.write(writeThis);
outputStream.close();

	}

}
