package com.Chitra;

import java.util.ArrayList;

public class ItecCourse
{
        String name;
        int code;
        ArrayList<String> students;
        int maxStudents;
        String RoomNumber;

    ItecCourse(String courseName, int courseCode, int courseMaxStudents,String roomNumber)
    {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.RoomNumber = roomNumber;
    }

    public String getRoomNumber()
    {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber)
    {
        RoomNumber = roomNumber;
    }

    void addStudent(String studentName)
    {
        if ( students== null)
        {    //See if students has been set up yet – initialize it if not
            students = new ArrayList<String>();
        }
        students.add(studentName);
    }
    void removeStudent(String studentName)
    {
        if (students.contains(studentName))
        {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }


    void writeCourseInfo()
        {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        for (String student : this.students)
        {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
            System.out.println("The room Number for " + name + " course is " + getRoomNumber());
            System.out.println("********************************************************************");
    }

        int getNumberOfStudents()
        {
        return this.students.size();
    }


}

