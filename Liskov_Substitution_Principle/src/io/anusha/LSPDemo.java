package io.anusha;

import java.util.ArrayList;
import java.util.List;

public class LSPDemo {
	public static void PrintInfo(Shape r) {
		
		System.out.println("the result is "+ r.getArea());
	}


	public static void main(String args[]) {
		Square s = new Square();
		s.setSize(5);
		PrintInfo(s);
	}
}