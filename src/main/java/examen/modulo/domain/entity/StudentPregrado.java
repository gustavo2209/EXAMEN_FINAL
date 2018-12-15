package examen.modulo.domain.entity;

public class StudentPregrado implements IStudentRule{
    
    public boolean isMatch(Student student) {
        return student.getTypeGrade().startsWith("PREGRADO");
    }
    
    public double calculatePrice(Student student) {
           return 300;
    }  
}
