package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	// Method to read CSV file and return as a list
	public static List<String[]> read(String file) {
		
		List<String[]> data = new LinkedList<String[]>();
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				String[] records = line.split(",");
				data.add(records);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Count not find file!!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not read file!!");
			e.printStackTrace();
		}


		return data;
		
	}
	
}
