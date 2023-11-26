package controller;

import model.CourseCodeMap;

/**
 * @author Jolien Franke <j.franke@st.hanze.nl>
 * Purpose of program
 */

public class CourseCodeLauncher {

    public static void main(String[] args) {

        CourseCodeMap courseCodeMap = new CourseCodeMap();

        courseCodeMap.readFile("resources/vakcodes.txt");

        courseCodeMap.printCourseCodes();


    }
}
