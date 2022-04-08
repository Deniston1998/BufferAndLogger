package basee;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//file location 2. content
		 String location="UsingFile.txt";
		 String content="Learning java is simple";
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();

	}

}
