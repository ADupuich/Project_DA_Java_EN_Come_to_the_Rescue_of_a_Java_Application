package com.hemebiotech.analytics;

import java.util.Map;

/**
 * the important thing here is to have a Map ordered by the name of symptoms.
 * The value of each one is the sum of iteration. We should'nt see duplicates of
 * keys.
 * 
 */
public interface IFileWriter {

	void writeSymptomsInFile(Map<String, Integer> symptomsCount);

}