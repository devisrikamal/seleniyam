package week1.day1;

public class Mobile {
	public void makecall(){
		 String mobilemodel="redmi 9a";
		float mobileweight =150.8f;
		System.out.println("this is my mobile and model is " +mobilemodel);
		System.out.println("this is my mobile and weight is" +mobileweight + "grams");
		
	}
public  void sendMgs() {
	boolean isfullcharged=true;
	int mobilecost = 8000;
	System.out.println(" this is mobile fullcharged" +isfullcharged);
	System.out.println("this is mobile cost"+mobilecost);
	
}

public static void main(String[] args) {
	Mobile m=new Mobile();
	
	System.out.println("this is my mobile");
	m.makecall();
	m.sendMgs();
}
}
