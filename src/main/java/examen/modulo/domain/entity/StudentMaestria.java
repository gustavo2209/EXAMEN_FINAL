package examen.modulo.domain.entity;

public class StudentMaestria implements IStudentRule{
    
    public boolean isMatch(Student student) {
        return student.getTypeGrade().startsWith("MAESTRIA");
    }
    
    public double calculatePrice(Student student) {
           return 500;
    }    
}
