package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCount implements ISymptomCount {

	Map<String, Integer> symptomsCount = new TreeMap<>();

	/**
	 * TreeMap is important because it alphabetically order the Map. It's a
	 * requirements of Hemebiotech.
	 */

	@Override
	public Map<String, Integer> getSymptomsCount(List<String> nameOfSymptoms) {
		if (nameOfSymptoms != null && !nameOfSymptoms.isEmpty()) {
			for (String symptom : nameOfSymptoms) {
				/**
				 * Before add new symptom check if there is another symptom with the same name.
				 * If it's true add 1 to the count. If it's false begin the count vy 1.
				 */
				symptomsCount.put(symptom, symptomsCount.containsKey(symptom) ? symptomsCount.get(symptom) + 1 : 1);
			}
		}

		return symptomsCount;
	}

}
