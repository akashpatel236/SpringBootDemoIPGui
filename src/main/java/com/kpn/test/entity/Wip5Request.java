package com.kpn.test.entity;


public class Wip5Request {
	
	private java.lang.String houseNumber;
    private java.lang.String houseNumberExtension;
    private java.lang.String phoneNumber;
    private java.lang.String postalCode;
    private java.lang.String presentFutureIndicator;

    public Wip5Request() {
    }

    public Wip5Request(
           java.lang.String houseNumber,
           java.lang.String houseNumberExtension,
           java.lang.String phoneNumber,
           java.lang.String postalCode,
           java.lang.String presentFutureIndicator) {
           this.houseNumber = houseNumber;
           this.houseNumberExtension = houseNumberExtension;
           this.phoneNumber = phoneNumber;
           this.postalCode = postalCode;
           this.presentFutureIndicator = presentFutureIndicator;
    }

	public java.lang.String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(java.lang.String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public java.lang.String getHouseNumberExtension() {
		return houseNumberExtension;
	}

	public void setHouseNumberExtension(java.lang.String houseNumberExtension) {
		this.houseNumberExtension = houseNumberExtension;
	}

	public java.lang.String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(java.lang.String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public java.lang.String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(java.lang.String postalCode) {
		this.postalCode = postalCode;
	}

	public java.lang.String getPresentFutureIndicator() {
		return presentFutureIndicator;
	}

	public void setPresentFutureIndicator(java.lang.String presentFutureIndicator) {
		this.presentFutureIndicator = presentFutureIndicator;
	}
	
	

}
