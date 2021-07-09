package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	/*
	 * private static int headCount = 0; // initialize to 0 private static int
	 * rashCount = 0; // initialize to 0 private static int pupilCount = 0; //
	 * initialize to 0
	 */

	public static void main(String args[]) throws Exception {

		/**
		 * first get input with the ReadSymptomDataFromFile constructor, readSymptoms is
		 * a new instance of ReadSymptomDataFromFile with filepath as argument
		 */
		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile(
				"C:\\Users\\Amaur\\git\\ocr_projet4\\Project02Eclipse\\symptoms.txt");
		/**
		 * Initialyse nameOfSymptoms with method Getsymptoms on readSymptoms
		 */
		List<String> nameOfSymptoms = readSymptoms.GetSymptoms();

		/*
		 * Je vais avoir besoin d'"un tableau type dictionnaire qui aura pour clé les
		 * symptoms et pour valeur les occurences, j'utilise le constructeur TreeMap car
		 * il itère en suivant l'odre des données reçues HashMap ne garanti pas d'itérer
		 * dans le même ordre avec l'ajout de données et le TreeMap met dans l'odre
		 * alpha ce qui n'est pas le cas du Hashmap
		 */
		Map<String, Integer> symptomsCount = new TreeMap<>();
		// pour remplir ce tableau je garde une boucle for
		for (String line : nameOfSymptoms) {
			/*
			 * je lui demande d'ajouter d'ajouter la clé line, avec la valeur : tester
			 * l'objet line de symptomsCount, si vrai +1 : sinon 1.
			 */
			symptomsCount.put(line, symptomsCount.containsKey(line) ? symptomsCount.get(line) + 1 : 1);
		}
		// System.out.println(symptomsCount); // permet de voir le résultat
		/*
		 * Ce bloc de code est mis de côté { System.out.println("symptom from file: " +
		 * line); if (line.equals("headache")) { headCount++;
		 * System.out.println("number of headaches: " + headCount); } else if
		 * (line.equals("rash")) { rashCount++; } else if (line.contains("pupils")) {
		 * pupilCount++; } }
		 */
		/**
		 * In order to have the result in file we create writer with class Filewriter
		 */
		FileWriter writer = new FileWriter("result.out");
		/*
		 * Ce code est mis de côté pour trouver une autre solution
		 * writer.write("headache: " + headCount + "\n"); writer.write("rash: " +
		 * rashCount + "\n"); writer.write("dialated pupils: " + pupilCount);
		 * writer.close();
		 */
		for (String line : symptomsCount.keySet()) {
			writer.write(line + " : " + symptomsCount.get(line) + "\n");
		}
		// String symptom;
		// Integer valeur;
		/**
		 * I use Interface Iterator beacause I need to repeat an action for each line
		 */
		/*
		 * Iterator<String> iterator = symptomsCount.keySet().iterator(); // String
		 * newligne = System.getProperty("line.separator"); while (iterator.hasNext()) {
		 * symptom = iterator.next(); valeur = symptomsCount.get(symptom);
		 * writer.write(symptom + " : " + valeur + "\n"); }
		 */

		writer.close();
	}
}

//}
//}
