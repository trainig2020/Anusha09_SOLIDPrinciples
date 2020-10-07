package io.anusha;

public class WithdrawalMessengerUser implements WithdrawalMessenger {

	@Override
	public void tellNotEnoughMoneyInAccount() {
		System.out.println("There is not enough money in your account");

	}

}
