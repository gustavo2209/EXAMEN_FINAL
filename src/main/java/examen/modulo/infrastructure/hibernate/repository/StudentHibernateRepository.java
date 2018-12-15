package examen.modulo.infrastructure.hibernate.repository;

import examen.modulo.domain.entity.IStudentCalculator;
import examen.modulo.domain.entity.IStudentRule;
import examen.modulo.domain.entity.Student;
import examen.modulo.domain.entity.StudentAcademic;
import examen.modulo.domain.entity.StudentDoctorado;
import examen.modulo.domain.entity.StudentMaestria;
import examen.modulo.domain.repository.StudentRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
public class StudentHibernateRepository implements StudentRepository{
    private List<Student> students;
    private IStudentCalculator iStudentCalculator;
    private StudentAcademic studentAcademic;
    private List<IStudentRule> calculateRules;
    private IStudentRule iStudent;
    private List<IStudentRule> studentsRules;
    
    public StudentHibernateRepository () {
        students = new ArrayList();       
        studentsRules = new ArrayList();
        
        students.add(new Student(1L,"Gustavo Alfredo","Chimoy García","MAESTRIA"));
        students.add(new Student(1L,"Gerry","Vera Suasnabar","MAESTRIA"));
        students.add(new Student(2L,"Karin","Cansaya Morales","PREGRADO"));
        students.add(new Student(3L,"Manuel","Gutierrez Saravia","DOCTORADO"));
        students.add(new Student(3L,"Kimberly","Rodriguez Torres","DOCTORADO"));
    }
    
    @Override
    public List<Student> getAll() throws Exception {
        return students;
    }

    @Override
    public List<Student> findStudentByType(String typeStudent) throws Exception {
        List<Student> lstStudent = new ArrayList<>();
        for(Student student :students) {
            if(student.getTypeGrade().equals(typeStudent)) {
                student.setAmount(100.00);
                lstStudent.add(student);                
            }
        }
        return lstStudent;
    }
    
}
