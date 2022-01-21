import java.util.*;
import java.io.*;

public class CreateReadFile {

	public static void main(String[] args) 
			
		throws Exception {

		File file = new File("Exercise12_15.txt");
		
		if (file.exists()) {
			System.out.println("Sorry, this file already exists.\n"
					+ "Change the file name for the \'new\' file and try again.");
			System.exit(0);
		}

		try (

			PrintWriter outFile = new PrintWriter(file);
		) 
		
		{
		
			for (int i = 0; i < 100; i++) {
				outFile.print(((int)(Math.random() * 500) + 1));
				outFile.print(" ");
			}
		}

		ArrayList<Integer> randomList = new ArrayList<>();

		try(

			Scanner inFile = new Scanner(file);
		) {

			while (inFile.hasNext()) {
				randomList.add(inFile.nextInt());
			}
		}


		Collections.sort(randomList);

		System.out.print(randomList.toString());
		System.out.println();
	}
}