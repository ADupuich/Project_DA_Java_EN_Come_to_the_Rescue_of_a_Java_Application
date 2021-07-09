package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

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
		/**
		 * Now we need to coun each occurence of symptoms so we do this in symptomsCount
		 */
		SymptomsCount symptomsCount = new SymptomsCount();
		/**
		 * method getSymptomsCount with nameOfSymptoms as argument on the object
		 * symptomsCount will do Map<String, Integer>
		 */
		Map<String, Integer> symptomsCounter = symptomsCount.getSymptomsCount(nameOfSymptoms);
		/**
		 * Finaly we can use the method writeSymptomsInFile to create the results.txt
		 * file ont the writeSymptoms object
		 */
		WriteSymptoms writeSymptoms = new WriteSymptoms();
		writeSymptoms.writeSymptomsInFile(symptomsCounter);

	}
}

//}
//}
