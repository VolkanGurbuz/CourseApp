package com.volkan.gurbuz.CourseApp.model;

public class Course {
    private String courseID;
    private String courseName;
    private String teacherName;

    public Course(String courseID, String courseName, String teacherName) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.teacherName = teacherName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
