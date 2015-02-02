package ca.ualberta.cs;

import java.util.ArrayList;
import java.util.Collection;



public class ExpenseList {
	protected ArrayList<Expenseitem> expenseList = null;
	
	public ExpenseList() {
		// TODO Auto-generated method stub
		expenseList = new ArrayList<Expenseitem>();
		
		
	}
	public Collection<Expenseitem> getExpenseitem() {
		return expenseList;
		}
		public void addExpense(Expenseitem expenseitem) {
		expenseList.add(expenseitem);
		
		}
		public void removeExpense(Expenseitem expenseitem) {
			expenseList.remove(expenseitem);
			
		}
}
