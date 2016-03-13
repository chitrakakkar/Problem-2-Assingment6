package com.Chitra;

/**
 * Created by chitrakakkar on 3/3/16.
 */
public class ItecCourseManager
{
    public static void main(String args[])
    {
        ItecCourse maintenanceCourse = new ItecCourse("Microcomputer Systems Maintenance",1310,20,"T3010");
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();
        ItecCourse datacomCourse = new ItecCourse("Data Communication",1425,30,"T3020");
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();
        ItecCourse ProgramminCourse = new ItecCourse("Java",2545,5,"T3040");
        ProgramminCourse.addStudent("Gus");
        ProgramminCourse.addStudent("Harry");
        ProgramminCourse.addStudent("Izzy");
        ProgramminCourse.writeCourseInfo();
        //ProgramminCourse.removeStudent("Gus");
        ItecCourse ItPrograms = new ItecCourse("Info Tech Concepts",1100,30,"T3050");
        ItPrograms.addStudent("Max");
        ItPrograms.addStudent("Nancy");
        ItPrograms.addStudent("Orson");
        ItPrograms.writeCourseInfo();
    }
}
