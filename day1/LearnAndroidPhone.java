package week3.day1;

public class LearnAndroidPhone extends LearnSmartPhone{
	
	public void useWhatsapp(){
		
		System.out.println("whatsapp can be used");
	}
public void takeVideo(){
		
		System.out.println("1080 pixel");
	}
	
	
	public static void main(String[] args) {
		
		LearnAndroidPhone phone = new LearnAndroidPhone();
		LearnSmartPhone smt = new LearnSmartPhone();
	
		phone.useWhatsapp();
		phone.sendMsg();
		phone.makeCall();
		phone.takeVideo();//overriding to smtphone
		smt.takeVideo();
		
		
	}
//multilevel inheritance done
}
