package examen.modulo.domain.entity;

public interface IStudentRule {
    public boolean isMatch(Student student);
    public double calculatePrice(Student student);
}
