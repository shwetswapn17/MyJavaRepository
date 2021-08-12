/*
1. Create an application for employee management having following classes: a)
Create an Employee class with following attributes and behaviors : i) EmpId Int ii)
EmpName String iii) EmpEmail String iv) EmpGender char v) EmpSalary float vi)
GetEmployeeDetails() -> prints employee details
b) Create one more class EmployeeDB which has the following methods. i) boolean
addEmployee(Employee e) ii) boolean deleteEmployee(int empId) iii) String
showPaySlip(int empId) iv) Employee[] listAll()
2. Do implementation of the above application with below two methods : I. Use an
ArrayList which will be used to store the employees and use enumeration/iterator
to process the employees. II. Use a TreeSet Object to store employees on the
basis of their EmpId and use enumeration/iterator to process employees. [Hint:
Use Comparable interface] Write a Test Program to test that all functionalities are
operational.
List enumeration / Iterator */

package com.training.arraytrials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee {

    private int empId;
    private String empName;
    private String empEmail;
    private  char empGender;
    private float empSalary;

    //GetEmployeeDetails() -> prints employee details
    public void getEmployeeDetails(){
        System.out.println("***** Employee Details *****");
        System.out.println("Employee ID = " + empId);
        System.out.println("Employee Name = " + empName);
        System.out.println("Employee Email = " + empEmail);
        System.out.println("Employee Gender = " + empGender);
        System.out.println("Employee Salary = " + empSalary);
    }

    public Employee(int empId,String empName,String empEmail,char empGender,float empSalary){
        this.empId = empId;
        this.empName=empName;
        this.empEmail=empEmail;
        this.empGender=empGender;
        this.empSalary=empSalary;
    }

    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public char getEmpGender() {
        return empGender;
    }

    public float getEmpSalary() {
        return empSalary;
    }
}

class EmployeeDB{
    List<Employee> empList=new ArrayList<Employee>();
    boolean addEmployee(Employee e){
        empList.add(e);
        return true;
    }
    boolean deleteEmployee(int empId){
        for (int i=0;i<empList.size();i++) {
            if (empList.get(i).getEmpId() == empId) {
                empList.remove(i);
                return true;
            }
        }
        return false;
    }
    String showPaySlip(int empId){  //don't know what to do exactly ?????
        for (Employee e:empList) {
            if(e.getEmpId()==empId)
                System.out.println("Salary = "+e.getEmpSalary());
        }
        return "";
    }
    Employee[] listAll() {
        System.out.println("******* All Employee Details *******");
        for (Employee e:empList) {
            System.out.println("Employee ID = "+e.getEmpId());
            System.out.println("Employee Name = "+e.getEmpName());
            System.out.println("Employee Email = "+e.getEmpEmail());
            System.out.println("Employee Gender = "+e.getEmpGender());
            System.out.println("Employee Salary = "+e.getEmpSalary());
        }
        Employee[] arr = new Employee[empList.size()];
        arr = empList.toArray(arr);
        return arr ;
    }
}

public class EmployeeMain{
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Shweta","shw@gmail.com",'F', 123.45f);
        Employee e2=new Employee(102,"Swapnil","swap@gmail.com",'M', 234.12f);
        Employee e3=new Employee(103,"Ovi","ovi@gmail.com",'F', 345.15f);
        Employee e4=new Employee(104,"Lina","Lina@gmail.com",'F', 1234.45f);
        Employee e5=new Employee(105,"Tina","Tina@gmail.com",'F', 2342.12f);
        Employee e6=new Employee(106,"Shina","Shina@gmail.com",'F', 3451.15f);
        e1.getEmployeeDetails();
        EmployeeDB obj=new EmployeeDB();
        obj.addEmployee(e1);
        obj.addEmployee(e2);
        obj.addEmployee(e3);
        obj.addEmployee(e4);
        obj.addEmployee(e5);
        obj.addEmployee(e6);
        obj.listAll();
        //obj.deleteEmployee(103);
        System.out.println("Enter employee Id which you want to delete ");
        Scanner input=new Scanner(System.in);
        int id=input.nextInt();
        obj.deleteEmployee(id);
        System.out.println(" Arraylist - After deletion ");
        obj.listAll();
        /*Employee[] arr=obj.listAll();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getEmpId());
        }
        */
    }
}