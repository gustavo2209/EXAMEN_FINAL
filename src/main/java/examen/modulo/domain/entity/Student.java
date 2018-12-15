package examen.modulo.domain.entity;

public class Student {
    Long studentId;
    String name;
    String lastName;
    String typeGrade;
    Double amount;

    public Student(Long studentId, String name, String lastName, String typeGrade) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.typeGrade = typeGrade;
        this.amount = 0.0;
    }

    public Student() {
    }    
    
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTypeGrade() {
        return typeGrade;
    }

    public void setTypeGrade(String typeGrade) {
        this.typeGrade = typeGrade;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
