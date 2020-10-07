package io.anusha;

public class LoginMessengerUser implements LoginMessenger {

	@Override
	public void askForCard() {
		System.out.println("Here is the card");
		
	}

	@Override
	public void tellInvalidCard() {
		System.out.println("It is invalid card");
		
	}

	@Override
	public void askForPin() {
		System.out.println("Here is the pin");
		
	}

	@Override
	public void tellInvalidPin() {
		System.out.println("It is invalid pin");
		
	}

}