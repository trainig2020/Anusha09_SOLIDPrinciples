package io.anusha;

public class VideoMedia extends Media {

	@Override
	void printInfo() {
		System.out.println("This is a Video. Its name is " + getName()
				+ " its duration is " + getDuration());
	}

}
