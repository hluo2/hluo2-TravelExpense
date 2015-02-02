package ca.ualberta.cs;



public class Expenseitem {

		// TODO Auto-generated constructor stub
		private String itemname;
		private String date;
		private String spent;
		private String currency;
		private String detail;
	
		public Expenseitem(String itemname,String date,String spent,String currency,String detail){
			this.itemname = itemname;
			this.date = date;
			this.spent = spent;
			this.currency = currency;
			this.detail = detail;
		}
		public String getdate(){
			return date;
		}
		public  void setdate(String date){
			this.date = date;
		}
		public String getname(){
			return itemname;
		}
		public void setname(String itemname){
			this.itemname = itemname;
		}
		public void getspent(String spent){
			this.spent = spent;
		}
		public String setspent(){
			return spent;
		}
		
		public void getcurrency(String currency){
			this.currency = currency;
		}
		public String setcurrency(){
			return currency;
		}
		
		public String getdtail(){
			return detail;
		}
		public void setdetail(String detail){
			this.detail = detail;
			
		}
	
}
