package com.kpn.test.entity;

public class ConnectionPointDetails {
	
	private java.lang.String cgbNameShort;
    private java.lang.String cgbNumber;
    private java.lang.String connectionPointEnd;
    private java.lang.String connectionPointEndDescription;
    private java.lang.String connectionPointNumber;
    private java.lang.String connectionPointNumberExtention;
	
	public java.lang.String getCgbNameShort() {
		return cgbNameShort;
	}

	public void setCgbNameShort(java.lang.String cgbNameShort) {
		this.cgbNameShort = cgbNameShort;
	}

	public java.lang.String getCgbNumber() {
		return cgbNumber;
	}

	public void setCgbNumber(java.lang.String cgbNumber) {
		this.cgbNumber = cgbNumber;
	}

	public java.lang.String getConnectionPointEnd() {
		return connectionPointEnd;
	}

	public void setConnectionPointEnd(java.lang.String connectionPointEnd) {
		this.connectionPointEnd = connectionPointEnd;
	}

	public java.lang.String getConnectionPointEndDescription() {
		return connectionPointEndDescription;
	}

	public void setConnectionPointEndDescription(java.lang.String connectionPointEndDescription) {
		this.connectionPointEndDescription = connectionPointEndDescription;
	}

	public java.lang.String getConnectionPointNumber() {
		return connectionPointNumber;
	}

	public void setConnectionPointNumber(java.lang.String connectionPointNumber) {
		this.connectionPointNumber = connectionPointNumber;
	}

	public java.lang.String getConnectionPointNumberExtention() {
		return connectionPointNumberExtention;
	}

	public void setConnectionPointNumberExtention(java.lang.String connectionPointNumberExtention) {
		this.connectionPointNumberExtention = connectionPointNumberExtention;
	}

	public ConnectionPointDetails() {
    }

    public ConnectionPointDetails(
           java.lang.String cgbNameShort,
           java.lang.String cgbNumber,
           java.lang.String connectionPointEnd,
           java.lang.String connectionPointEndDescription,
           java.lang.String connectionPointNumber,
           java.lang.String connectionPointNumberExtention) {
           this.cgbNameShort = cgbNameShort;
           this.cgbNumber = cgbNumber;
           this.connectionPointEnd = connectionPointEnd;
           this.connectionPointEndDescription = connectionPointEndDescription;
           this.connectionPointNumber = connectionPointNumber;
           this.connectionPointNumberExtention = connectionPointNumberExtention;
    }
}
