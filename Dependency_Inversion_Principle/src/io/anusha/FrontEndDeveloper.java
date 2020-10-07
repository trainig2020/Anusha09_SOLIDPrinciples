package io.anusha;

public class FrontEndDeveloper implements Developer {

	@Override
	public void develop() {
		writeJavascript();
	}

	public void writeJavascript() {
		System.out.println("writing Javascript code");
	}

}