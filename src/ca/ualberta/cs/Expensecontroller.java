package ca.ualberta.cs;



public class Expensecontroller {
	private static ExpenseList expenseList = null;
	static public ExpenseList getExpenseList() {
		if (expenseList  == null){
			expenseList = new ExpenseList();
		}
		return expenseList;
	}
	public void addExpense(Expenseitem expenseitem) {
		// TODO Auto-generated method stub
		getExpenseList().addExpense(expenseitem);
	}
	

	
}
