package com.Chitra;

/**
 * Created by chitrakakkar on 3/3/16.
 */
public class ItecCourseManager
{
    public static void main(String args[])
    {
        ItecCourse maintenanceCourse = new ItecCourse("Microcomputer Systems Maintenance",1310,20,100);
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();
        ItecCourse datacomCourse = new ItecCourse("Data Communication",1425,30,200);
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.writeCourseInfo();
        ItecCourse ProgramminCourse = new ItecCourse("Java",2545,5,300);
        ProgramminCourse.addStudent("Gus");
        ProgramminCourse.addStudent("Harry");
        ProgramminCourse.addStudent("Izzy");
        ProgramminCourse.writeCourseInfo();
        ProgramminCourse.removeStudent("Gus");

    }
}
