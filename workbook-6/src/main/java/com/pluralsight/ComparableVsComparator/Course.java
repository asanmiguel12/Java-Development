package com.pluralsight.ComparableVsComparator;

public class Course {
    private String title;
    private int studyPoints;
    private int maxSize;

    public Course(String title, int studyPoints, int maxSize) {
        this.title = title;
        this.studyPoints = studyPoints;
        this.maxSize = maxSize;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public double getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
