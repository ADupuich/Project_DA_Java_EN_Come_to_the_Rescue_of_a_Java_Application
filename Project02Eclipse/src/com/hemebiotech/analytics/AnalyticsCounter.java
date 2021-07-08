package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headCount = 0; // counts headaches, supression de headacheCount remplacé par headCount qui est
										// utilisé plus bas dans le code
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0

	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\Amaur\\git\\ocr_projet4\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		while (line != null) {
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
				// faute d'orthographe rash, pas rush
			} else if (line.equals("rash")) {
				rashCount++;
				/*
				 * soucis avec pupils, il y a 2 symptoms différents avec cette dénomination
				 * dilayted et constricted pupils donc retourne la somme des 2 soit 7
				 */
			} else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine(); // get another symptom
		}

		// next generate output
		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + headCount + "\n"); // haedacheCount remplacé par headCount, la première variable ne
														// renvoi pas de valeur
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount);
		writer.close();
		reader.close();
	}
}
