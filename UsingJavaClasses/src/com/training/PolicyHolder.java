package com.training;

public class PolicyHolder {
	
	private String policyholderName;
	private String nominee;
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PolicyHolder(String policyholderName, String nominee) {
		super();
		this.policyholderName = policyholderName;
		this.nominee = nominee;
	}

	public String getPolicyholderName() {
		return policyholderName;
	}
	public void setPolicyholderName(String policyholderName) {
		this.policyholderName = policyholderName;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String payPremium(double premiumAmount)
	{
		return premiumAmount + ":=paid by cash";
	}

}
