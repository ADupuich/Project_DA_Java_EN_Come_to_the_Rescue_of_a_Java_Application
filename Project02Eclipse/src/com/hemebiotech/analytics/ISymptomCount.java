package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCount {
	/**
	 * This method will return a dictionary Map. It takes nameOfSymptoms in
	 * arguments which is a list of String.
	 * 
	 * @param nameOfSymptoms is the list non ordered with duplications
	 * @return an ordered Map with symptom as key and count as value
	 */

	Map<String, Integer> getSymptomsCount(List<String> nameOfSymptoms);

}