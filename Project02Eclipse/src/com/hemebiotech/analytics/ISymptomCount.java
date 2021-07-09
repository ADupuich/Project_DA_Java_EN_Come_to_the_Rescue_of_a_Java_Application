package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCount {
	/**
	 * This method will return a dictionary Map<symtoms, count>. It takes
	 * nameOfSymptoms in arguments which is a list of String.
	 */

	Map<String, Integer> getSymptomsCount(List<String> nameOfSymptoms);

}