package project;

public class Income extends Budget {
	private String name;
	private double plannedIncome;
	private static double totalIncome;
	private static double leftOverIncome;
	
	public Income() {
	}

	public Income(double incomeToAdd) {
		setPlannedIncome(incomeToAdd);
	}
	
	public Income(double incomeToAdd, String name) {
		setPlannedIncome(incomeToAdd);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPlannedIncome() {
		return plannedIncome;
	}

	public void setPlannedIncome(double plannedIncome) {
		this.plannedIncome = plannedIncome;
		addIncome(plannedIncome);
	}

	public static double getTotalIncome() {
		return totalIncome;
	}

	public static double getLeftOverIncome() {
		return leftOverIncome;
	}

	public static void setLeftOverIncome() {
		Income.leftOverIncome = Income.totalIncome - Expenses.getTotalExpenses();
	}

	public void addIncome(double incomeToAdd) {
		Income.totalIncome += incomeToAdd;
		setLeftOverIncome();
	}

	@Override
	public void formattedPrint() {
		System.out.printf("%-6s\t\t%1.2f", this.name, this.plannedIncome);
	}

}
