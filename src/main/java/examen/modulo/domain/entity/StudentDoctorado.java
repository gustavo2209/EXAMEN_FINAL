package examen.modulo.domain.entity;

public class StudentDoctorado implements IStudentRule{

    public StudentDoctorado() {
        super();
    }    
    
    public boolean isMatch(Student student) {
        return student.getTypeGrade().startsWith("DOCTORADO");
    }
    
    public double calculatePrice(Student student) {
           return 1000;
    }  
}
