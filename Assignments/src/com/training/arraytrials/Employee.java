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

public class Employee {
    int EmpId;
    String EmpName;
    String EmpEmail;
    char EmpGender;
    float EmpSalary;

    //GetEmployeeDetails() -> prints employee details
    public void GetEmployeeDetails(){

    }
}

class EmployeeDB{
    boolean addEmployee(Employee e){
        return true;
    }
    boolean deleteEmployee(int empId){
        return true;
    }
    String showPaySlip(int empId){
        return "";
    }
   /* Employee[] listAll(){
        return ;
    }*/
}