package fileValidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordMeaning {
	public static void main(String[] args) throws FileNotFoundException {
		doesFileExist();
	}

	public static void doesFileExist() throws FileNotFoundException {

		File file = new File("src\\wordmeaning.txt");
		Scanner fileReader = new Scanner(file);

		if (file.exists()) {
			System.out.println("File exist");
		} else {
			System.out.println("File does not exist!");
		}
		while (fileReader.hasNextLine()) {

			String data = fileReader.nextLine();
			String[] dataArray = data.split("-");

			String word = dataArray[0];
			System.out.println(word);

			String meaning = dataArray[1];
			String[] meaningArray = meaning.split(",");

			for (String mean : meaningArray) {
				System.out.println(mean);
			}
		}
	}
}
