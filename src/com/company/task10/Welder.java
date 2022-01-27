package com.company.task10;

public class Welder extends Person{

    private int jobSeniority;

    public Welder(String name, int jobSeniority) {
        super(name);
        this.jobSeniority = jobSeniority;
    }

    @Override
    public String toString() {
        return "person" + super.toString()+
                "Welder{" +
                "jobSeniority=" + jobSeniority +
                '}';
    }
}
