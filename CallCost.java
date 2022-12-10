public class CallCost
{
	public static void main(String args[])
	{
		double balance,rate,duration,cost;
		balance=170;
		rate=1.02;
		duration=37;
		cost=duration*rate;
		balance=balance-cost; 
		
		System.out.print("Call Duration");
		System.out.print(duration);
		System.out.println("Seconds");
		System.out.println("Balance is "+balance+ "Rupee s");
	}
}  