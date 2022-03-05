package org.student;

import org.department.Department;

public class Student extends Department {

	public static void studentName() {
		System.out.println("Student Name - from org.student.Student.studentName");
	}

	public static void studentDept() {
		System.out.println("Student Dept - from org.student.Student.studentDept");
	}

	public static void studentId() {
		System.out.println("Student Id - from org.student.Student.studentId");

	}

	public static void main(String[] args) {
		Department.collegeCode();
		Department.collegeName();
		Department.collegeRank();
		Department.deptName();
		Student.studentDept();
		Student.studentId();
		Student.studentName();
	}

}
