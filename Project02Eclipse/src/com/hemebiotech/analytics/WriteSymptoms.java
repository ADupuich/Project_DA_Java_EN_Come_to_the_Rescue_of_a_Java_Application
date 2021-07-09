package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptoms implements IFileWriter {

	@Override
	public void writeSymptomsInFile(Map<String, Integer> symptomsCount) {

		try {

			/**
			 * In order to have the result in file we create writer with class Filewriter
			 */
			FileWriter writer = new FileWriter("result.txt");
			for (String line : symptomsCount.keySet()) {
				writer.write(line + " : " + symptomsCount.get(line) + "\n");
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
