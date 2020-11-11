class PhonePay{
	public static void payment(long Mobileno){
		System.out.println("Your Mobile recharge done successfully");
	}
	public static void payment(String DTH){
		System.out.println("Your "+DTH+" number bill paid successfully");
	}
	public static void payment(int meterId,String name,int amount){
		System.out.println("Paid electricity bill of "+meterId+" rupees "+amount+" of "+name);
	}
	public static void payment(int creditcardno,int amount){
		System.out.println("Credit card bill paid successfully for" +creditcardno + "for amount" +amount );                                     
	}
	public static void main(String args[]){
		PhonePay.payment(9989270982l);
		PhonePay.payment("DTH26702174178");
		PhonePay.payment(998102,"Arjun",3000);
		PhonePay.payment(11995,2000);
	}
}