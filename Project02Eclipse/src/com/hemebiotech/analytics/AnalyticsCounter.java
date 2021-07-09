package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {
	private static int headCount = 0; // initialize to 0
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0

	public static void main(String args[]) throws Exception {

		/*
		 * Ce code est mis de côté Try to call the method BufferedReader reader = new
		 * BufferedReader( new FileReader(
		 * "C:\\Users\\Amaur\\git\\ocr_projet4\\Project02Eclipse\\symptoms.txt"));
		 * String line = reader.readLine(); System.out.println(reader);
		 */

		/**
		 * first get input with the ReadSymptomDataFromFile class, readSymptoms est une
		 * nouvelle instance de la classe ReadSymptomDataFromFile prenant le filepath
		 * comme argument
		 */
		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile(
				"C:\\Users\\Amaur\\git\\ocr_projet4\\Project02Eclipse\\symptoms.txt");
		/**
		 * Initie nameOfSymptoms, instancié par la methode Getsymptoms pointant sur
		 * readSymptoms
		 */
		List<String> nameOfSymptoms = readSymptoms.GetSymptoms();

		/*
		 * System.out.println(nameOfSymptoms); Ce code ne sert plus à grand chose
		 *
		 * counts headaches : adaptons le code pour compter les symptoms, initialement
		 * proposé dans le code
		 */
		for (String line : nameOfSymptoms) {
			/*
			 * J'opte pour une boucle for plus que while, pour chaque occurence
			 *
			 * while (line != null && !nameOfSymptoms.isEmpty()) Ce code ne sert plus à
			 * grand chose
			 */
			{
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headCount++;
					System.out.println("number of headaches: " + headCount);
				} else if (line.equals("rash")) {
					rashCount++;
				} else if (line.contains("pupils")) {
					pupilCount++;
				}
			}
		}
		/* line = reader.readLine(); ce code ne sert plus next generate output */
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount);
		writer.close();
		// reader.close(); Ce code ne sert plus
	}
}
