package com.fannie.day4;

import java.util.ArrayList;

class BankValidator {
	String bankName;
	String vaditorCompany;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getVaditorCompany() {
		return vaditorCompany;
	}

	public void setVaditorCompany(String vaditorCompany) {
		this.vaditorCompany = vaditorCompany;
	}

	public BankValidator(String bankName, String vaditorCompany) {
		super();
		this.bankName = bankName;
		this.vaditorCompany = vaditorCompany;
	}

	@Override
	public String toString() {
		return "BankValidator [bankName=" + bankName + ", vaditorCompany=" + vaditorCompany + "]";
	}

}

public class UserDefMultipleException {

	static ArrayList<BankValidator> list;

	static {
		list = new ArrayList<BankValidator>();

		list.add(new BankValidator("CITI", "FANNIE"));
		list.add(new BankValidator("SC", "FREDDI"));
		list.add(new BankValidator("HSBC", "FANNIE"));
		list.add(new BankValidator("MNT", "FANNIE"));
	}

	public static String getMyValidator(String bankName) {
		for (BankValidator temp : list) {
			if (temp.getBankName().equals(bankName)) {
				return temp.getVaditorCompany();
			}
		}
		return "Invalid";
	}

	public static void validateCreditScore(String name, String bankName, int creditScore) 
			throws FannieMaeException, FreddiMacException {
		String validateCompany = getMyValidator(bankName);

		if (validateCompany.equals("FANNIE")) {
			if (creditScore < 500) {
				throw new FannieMaeException
					("Sorry Loan Not Processed Ms/Mr/Mrs :" + name);
			} else {
				System.out.println("We are good to go from FannieMae");
			}
		} else if (validateCompany.equals("FREDDI")) {
			if(creditScore<300){
				throw new FreddiMacException("Sorry Your score is not good for loan :"+ name);
			}else{
				System.out.println("We are processing from FreddiMac");
			}
		} else {
			System.out.println("Sorry invalid Bank Name");
		}
	}

	public static void main(String[] args) {
		try {
			validateCreditScore("Virgil", "CITI", 567);
		} catch (FannieMaeException | FreddiMacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
