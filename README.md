Employee Payroll Management System
This Java-based project implements an Employee Payroll Management System with an object-oriented approach. The system supports both full-time and part-time employees, with abstract classes and inheritance providing the flexibility to extend functionality.

Features:
Employee Types: Supports Full-Time and Part-Time Employees.

Payroll Calculation: Calculates salary based on employee type—fixed monthly salary for full-time employees, and hourly rate for part-time employees.
Employee Management: Add or remove employees from the payroll and display detailed information.

Classes:
Employee (Abstract): Base class for employees with common attributes (name, ID) and abstract method calculateSalary().
FullTimeEmployee: Subclass representing full-time employees with a monthly salary.
PartTimeEmployee: Subclass representing part-time employees with hours worked and hourly rate.
PayRoll: Manages a list of employees, including adding, removing, and displaying employee details.
