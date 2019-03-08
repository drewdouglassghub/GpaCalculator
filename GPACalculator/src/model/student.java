package model;

public class student {

	
	String firstName;
	String lastName;
	String studentEmail;
	String studentGrade1;
	String studentGrade2;
	String studentGrade3;
	String studentGrade4;
	
	float gpa;
	
	int course1Hours;
	int course2Hours;
	int course3Hours;
	int course4Hours;
	
	public student() {
		
	}
	
	public student(String firstName, String lastName, String studentEmail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentEmail = studentEmail;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	public String getStudentGrade1() {
		return studentGrade1;
	}

	public void setStudentGrade1(String studentGrade1) {
		this.studentGrade1 = studentGrade1;
	}

	public String getStudentGrade2() {
		return studentGrade2;
	}

	public void setStudentGrade2(String studentGrade2) {
		this.studentGrade2 = studentGrade2;
	}

	public String getStudentGrade3() {
		return studentGrade3;
	}

	public void setStudentGrade3(String studentGrade3) {
		this.studentGrade3 = studentGrade3;
	}

	public String getStudentGrade4() {
		return studentGrade4;
	}

	public void setStudentGrade4(String studentGrade4) {
		this.studentGrade4 = studentGrade4;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public int getCourse1Hours() {
		return course1Hours;
	}

	public void setCourse1Hours(int course1Hours) {
		this.course1Hours = course1Hours;
	}

	public int getCourse2Hours() {
		return course2Hours;
	}

	public void setCourse2Hours(int course2Hours) {
		this.course2Hours = course2Hours;
	}

	public int getCourse3Hours() {
		return course3Hours;
	}

	public void setCourse3Hours(int course3Hours) {
		this.course3Hours = course3Hours;
	}

	public int getCourse4Hours() {
		return course4Hours;
	}

	public void setCourse4Hours(int course4Hours) {
		this.course4Hours = course4Hours;
	}

	@Override
	public String toString() {
		return "student [firstName=" + firstName + ", lastName=" + lastName + ", studentEmail=" + studentEmail
				+ ", studentGrade1=" + studentGrade1 + ", studentGrade2=" + studentGrade2 + ", studentGrade3="
				+ studentGrade3 + ", studentGrade4=" + studentGrade4 + ", gpa=" + gpa + ", course1Hours=" + course1Hours
				+ ", course2Hours=" + course2Hours + ", course3Hours=" + course3Hours + ", course4Hours=" + course4Hours
				+ "]";
	}

	
	
}
