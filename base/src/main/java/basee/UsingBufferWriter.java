package basee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String location="Usingbuffer.txt";
		 String content="Learning j";
		 FileWriter fileWriter = new FileWriter(location);
		 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		 bufferedWriter.write(content);
		 bufferedWriter.close();

	}

}
