package io.anusha;

public class Square extends Shape {
	private int size;

	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	int getArea() {
		return size*size;
	}

}
