package com.Benelzane.pojo.employee;

import java.util.Objects;

public class Employee {
    private String empId;
    private String branchId;
    private String name;
    private String surname;
    private String dateOfBirth;
    private long idNumber;
    private String gender;
    private String email;
    private long phone;

    protected Employee(){}
    public String getEmpId() {
        return empId;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public static class EmployeeBuilder{
        private String empId;
        private String branchId;
        private String name;
        private String surname;
        private String dateOfBirth;
        private long idNumber;
        private String gender;
        private String email;
        private long phone;

        public EmployeeBuilder buildEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder buildBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        public EmployeeBuilder buildName(String name)
        {   this.name = name;
            return this;
        }

        public EmployeeBuilder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public EmployeeBuilder buildDateOfBirth(String dateOfBirth)
        {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public EmployeeBuilder buildIdNumber(long idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public EmployeeBuilder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder buildPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public Employee buildEmployee(){
            Employee employee = new Employee();
            employee.empId = this.empId;
            employee.branchId = this.branchId;
            employee.name = this.name;
            employee.surname = this.surname;
            employee.dateOfBirth = this.dateOfBirth;
            employee.idNumber = this.idNumber;
            employee.gender = this.gender;
            employee.email = this.email;
            employee.phone = this.phone;
            return employee;
        }

    }//end of branch builder class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return idNumber == employee.idNumber && phone == employee.phone && Objects.equals(empId, employee.empId) && Objects.equals(branchId, employee.branchId) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(gender, employee.gender) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, branchId, name, surname, dateOfBirth, idNumber, gender, email, phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", branchId='" + branchId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", idNumber=" + idNumber +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}//end of branch class

