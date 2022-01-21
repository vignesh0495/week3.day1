package week3.day1;

public class AxisBank extends BankInfo{
	
	public void Savings() {
		System.out.println("use cashless transaction in savings acc" );
	}
	
	
    public static void main(String[] args) {
    	AxisBank Bank = new AxisBank();
    	BankInfo info = new BankInfo();
    	Bank.deposit();
    	Bank.fixed();
    	info.Savings();
    	Bank.Savings();
    	
	}
    
}
