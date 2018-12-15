package examen.modulo.domain.entity;

public class StudentAcademic {
    private IStudentCalculator iStudentCalculator;

    public StudentAcademic() {
        
    }    
    
    public IStudentCalculator getiStudentCalculator() {
        return iStudentCalculator;
    }

    public void setiStudentCalculator(IStudentCalculator iStudentCalculator) {
        this.iStudentCalculator = iStudentCalculator;
    }
    
    
}
