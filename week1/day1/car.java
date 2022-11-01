package week1.day1;

public class car {
	public void applybreak() {
		System.out.println("applied break");
	}
public void soundhoren() {
	System.out.println("sound horen");
}
public static class bike {
	public void applybreak() {
		System.out.println("applied break");
	}
	public void soundhoren() {
		System.out.println("sound horen");
	}
	public static void main(String[] args) {
		car c1=new car();
		bike b=new bike();
		c1.applybreak();
		c1.soundhoren();
		b.applybreak();
		b.soundhoren();
	}
}

}
