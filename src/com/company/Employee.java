package com.company;


import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private String jobId;
    private int salary;



    public Employee(String name, int age, char sex, String jobId, int salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.jobId = jobId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age
                && sex == employee.sex
                && salary == employee.salary
                && Objects.equals(name, employee.name)
                && Objects.equals(jobId, employee.jobId);
    }

}

