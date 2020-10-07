package io.anusha;

public class AudioMedia extends Media {

	@Override
	void printInfo() {
		System.out.println("This is a Audio. Its name is " + getName()
				+ " its duration is " + getDuration());
	}

}
