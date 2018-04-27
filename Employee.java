
public class Employee {
	private String name;
	private int rank;
	private int yearsOfExperiance;

	public Employee(String name, int rank, int yearsOfExperiance) {

		this.name = name;
		this.rank = rank;
		this.yearsOfExperiance = yearsOfExperiance;
	}

	public Employee(Employee e) {

		name = e.name;
		rank = e.rank;
		yearsOfExperiance = e.yearsOfExperiance;

	}

	public void display() {

		System.out.println("Name: " + name);
		System.out.println("Rank: " + rank);
		System.out.println("Total years of experiance: " + yearsOfExperiance);

	}

	public double calculateSalary() {
		double salary = yearsOfExperiance * 500 + rank * 1000;

		return salary;

	}

	public int getRank() {
		return rank;
	}

	public int getYearsOfExperiance() {
		return yearsOfExperiance;
	}

}
