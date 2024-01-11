package com.cisco.session3.customexc;

public class CustomException {

	public static void checkPhone(String phone) throws InvalidPhoneNumberException{
		if(phone.isEmpty()) {
			InvalidPhoneNumberException exception= 
					new InvalidPhoneNumberException("Phone Number cannot be Empty");
			throw exception;
		}
	}
	public static void checkEmail(String email) throws InvalidEmailException{
		if(email.isEmpty()) {
			InvalidEmailException exception= 
					new InvalidEmailException("Email cannot be Empty");
			throw exception;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Customer Management App started");
		String phone="";
		String email="";
		try {
			checkPhone(phone);
			checkEmail(email);
		} catch (InvalidPhoneNumberException e) {
			e.printStackTrace();
		}catch (InvalidEmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Customer Management App Finished");
	}
}
