/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author Vino
 */
public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private String hire_date;
    private String job;
    private double salary;
    private double commission_pct;
    private int manager;
    private int department;
    
    public Employee(){
        
    }

    public Employee(int id, String first_name, String last_name, String email, String phone_number, String hire_date, String job, double salary, double commission_pct, int manager, int department) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.hire_date = hire_date;
        this.job = job;
        this.salary = salary;
        this.commission_pct = commission_pct;
        this.manager = manager;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getHire_date() {
        return hire_date;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommission_pct() {
        return commission_pct;
    }

    public int getManager() {
        return manager;
    }

    public int getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission_pct(double commission_pct) {
        this.commission_pct = commission_pct;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + hire_date + ", job=" + job + ", salary=" + salary + ", commission_pct=" + commission_pct + ", manager=" + manager + ", department=" + department + '}';
    }
    
    
}
