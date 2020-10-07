package io.anusha;

public class SRPDemo {
	public static void main(String[] args) {
		Media m = new AudioMedia();
		m.setDuration(90);
		m.setName("Titanic");
		m.WriteTo(new FileWriter());
		m.printInfo();
	}
}
