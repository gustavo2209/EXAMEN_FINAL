package examen.modulo.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentCalculator implements IStudentCalculator{
    private List<IStudentRule> calculateRules;

	public StudentCalculator() {
		calculateRules = new ArrayList<IStudentRule>();
		calculateRules.add(new StudentDoctorado());
		calculateRules.add(new StudentMaestria());
		calculateRules.add(new StudentPregrado());
		
	}

	public double calculatePrice(Student student) {
		return calculateRules.stream().filter(i -> i.isMatch(student)).findFirst().get().calculatePrice(student);
	}
}
