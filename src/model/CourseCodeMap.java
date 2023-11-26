package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Purpose of program
 */

public class CourseCodeMap {
    Map<String, Integer> courseCodes = new HashMap<>();

    public void readFile(String filename) {

        try (Scanner fileScanner = new Scanner(new File(filename))) {

            while (fileScanner.hasNextLine()) {
                String code = fileScanner.next();
                Integer ects = fileScanner.nextInt();

                courseCodes.put(code, ects);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
    }

    public Integer getValue(String code) {
        return courseCodes.get(code);
    }

    public boolean checkIfValueIsPresent(Integer ects) {
        return courseCodes.containsValue(ects);
    }

    public void printCourseCodes() {
        Set<String> codes = courseCodes.keySet();
        for (String code : codes) {
            System.out.println(code);
        }
    }

    public void printECTS() {
        for (Integer value : courseCodes.values()) {
            System.out.println(value);
        }
    }

    public int printSumECTS() {
        int sum = 0;
        for (Integer value : courseCodes.values()) {
            sum += value;
        }

        return sum;
    }

    public void printEntry() {
        for (Map.Entry<String, Integer> entry : courseCodes.entrySet()) {
            System.out.println(entry);
        }
    }

    public void printSortedCourseCodes() {
        String[] codes = courseCodes.keySet().toArray(new String[0]);
        Arrays.sort(codes);

        for (String code : codes) {
            System.out.println(code + " " + courseCodes.get(code));
        }
    }


}
