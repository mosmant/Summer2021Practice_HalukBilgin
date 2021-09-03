package proje4_tekrarEdenKelimeler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RepetetiveWords {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\USER\\Desktop\\text.txt");
		RepetetiveWords rw = new RepetetiveWords();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			System.out.println(rw.newText(br));
		} catch (FileNotFoundException e) {
			System.out.println("file reader exception..");
			e.printStackTrace();
		}

	}

	public String newText(BufferedReader br) {

		String text = "";
		String line;
		try {
			while ((line = br.readLine()) != null) {
				text += line + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String works[] = text.split(" ");
		String result = text;

		for (int i = 0; i < works.length; i++) {

			if (i != works.length) {
				for (int j = i + 1; j < works.length; j++) {

					if (works[i].equals(works[j])) {

						result = result.replaceAll(works[i], "");

						break;

					}
				}
			}
		}

		return result;
	}

}