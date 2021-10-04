package com.practise.assignment;

public class Seventeen {

	public void check(String mail, String pin) throws UnAuthorizedUserException {
		if (mail.equalsIgnoreCase("krish@gmail.com")) {
			if (pin.equalsIgnoreCase("5544")){
				System.out.println("succesfully login");
			} else {
				throw new UnAuthorizedUserException("invalid inputs");
			}
		}else {
				throw new UnAuthorizedUserException("error");
			}
	}
}
