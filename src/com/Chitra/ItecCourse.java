package com.Chitra;

import java.util.ArrayList;
// a class which has methods and variables initialized and declared
public class ItecCourse
{
    // variables defined for the class
        String name;
        int code;
        ArrayList<String> students;
        int maxStudents;
        String RoomNumber;
        Integer FreeSpace;
    // a constructor class to create objects from this class
    ItecCourse(String courseName, int courseCode, int courseMaxStudents,String roomNumber)
    {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.RoomNumber = roomNumber;  // added new variable
    }


// getter and setter for roomNumber variable
    public String getRoomNumber()
    {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber)
    {
        RoomNumber = roomNumber;
    }

// user defined method to add students
    void addStudent(String studentName)
    {
        if ( students== null)
        {    //See if students has been set up yet – initialize it if not
            students = new ArrayList<String>();
        }
        students.add(studentName);
    }
    // user defined method to remove students
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
        // method to print info
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
            //System.out.println("The free space available for " + this.name + " is " + getSpaceAvailable(maxStudents,getNumberOfStudents()));
            System.out.println("********************************************************************");

    }
    // a method to get student's size

        int getNumberOfStudents()
        {
        return this.students.size();
    }
    // a method to calculate free space available
    public int getSpaceAvailable(Integer maxStudents,Integer NumberofStudents)

    {
        FreeSpace = maxStudents-NumberofStudents;
        return FreeSpace;

    }
}

