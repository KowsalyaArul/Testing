package com.selenium.Project1;

public class student_marks {
    private int physics;
    private int maths;
    private int sid;
    private String sname;
    private String sem;
    private double average;

    public student_marks() {
        // Default constructor
    }

    public student_marks(int physics, int maths, int sid, String sname, String sem) {
        this.physics = physics;
        this.maths = maths;
        this.sid = sid;
        this.sname = sname;
        this.sem = sem;
        this.average = (physics + maths) / 2.0;
    }

    public int getPhysics() {
        return physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSem() {
        return sem;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "SID: " + sid + " Name: " + sname + " Semester: " + sem ;
    }
}
