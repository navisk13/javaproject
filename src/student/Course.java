package student;

import java.io.Serializable;
import java.util.Scanner;
public class Course implements Serializable {

    String coursename;
    String coursecode;
    FirstPeriodical fp;
    SecondPeriodical sp;
    EndSem em;
    Internals in;
    ContinuousAssessment cm;
    GPA g;

    public Course()
    {
        fp = new FirstPeriodical();
        sp = new SecondPeriodical();
        em = new EndSem();
        in = new Internals();
        cm = new ContinuousAssessment();
        g= new GPA();
    }

    public void addCourse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course name");
        coursename = sc.next();
        System.out.println("Enter the course code");
        coursecode = sc.next();
        fp.addMark();
        sp.addMark();
        em.addMark();
        cm.addMark();
        CalculateInternal();
        CalculateGPA();
    }

    public void CalculateInternal()
    {
        in.calculate(fp,sp,cm);
    }

    public void CalculateGPA()
    {
        g.calculateGPA(in,em);
    }

    public String toString()
    {
        return "Course Name:"+coursename + " " + "Course Code:" + coursecode + " "+fp.toString()+sp.toString()+em.toString()+in.toString()+cm.toString()+g.toString();
    }

    public void print()
    {
        System.out.print(toString());
    }

}
