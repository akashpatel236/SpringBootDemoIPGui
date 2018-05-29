package com.kpn.test.entity;


public class Wip5Response {
	
	 	//private ConnectionPointDetails[] connectionPointDetailsArray;
	    private java.lang.String houseNumber;
	    private java.lang.String houseNumberExtension;
	    private java.lang.Integer numberOfConnections;
	    private java.lang.String postalCode;
	    private java.lang.String presentFutureIndicator;
	    private java.lang.String residence;
	    //private java.lang.String statusCodeDescription;
	    private java.lang.String streetName;
	    private java.lang.Integer wipErrorCode;

	    public Wip5Response() {
	    }

	    public Wip5Response(
	           ConnectionPointDetails[] connectionPointDetailsArray,
	           java.lang.String houseNumber,
	           java.lang.String houseNumberExtension,
	           java.lang.Integer numberOfConnections,
	           java.lang.String postalCode,
	           java.lang.String presentFutureIndicator,
	           java.lang.String residence,
	           java.lang.String statusCodeDescription,
	           java.lang.String streetName,
	           java.lang.Integer wipErrorCode) {
	           //this.connectionPointDetailsArray = connectionPointDetailsArray;
	           this.houseNumber = houseNumber;
	           this.houseNumberExtension = houseNumberExtension;
	           this.numberOfConnections = numberOfConnections;
	           this.postalCode = postalCode;
	           this.presentFutureIndicator = presentFutureIndicator;
	           this.residence = residence;
	           //this.statusCodeDescription = statusCodeDescription;
	           this.streetName = streetName;
	           this.wipErrorCode = wipErrorCode;
	    }

		/*public ConnectionPointDetails[] getConnectionPointDetailsArray() {
			return connectionPointDetailsArray;
		}

		public void setConnectionPointDetailsArray(ConnectionPointDetails[] connectionPointDetailsArray) {
			this.connectionPointDetailsArray = connectionPointDetailsArray;
		}*/

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

		public java.lang.Integer getNumberOfConnections() {
			return numberOfConnections;
		}

		public void setNumberOfConnections(java.lang.Integer numberOfConnections) {
			this.numberOfConnections = numberOfConnections;
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

		public java.lang.String getResidence() {
			return residence;
		}

		public void setResidence(java.lang.String residence) {
			this.residence = residence;
		}

		/*public java.lang.String getStatusCodeDescription() {
			return statusCodeDescription;
		}

		public void setStatusCodeDescription(java.lang.String statusCodeDescription) {
			this.statusCodeDescription = statusCodeDescription;
		}*/

		public java.lang.String getStreetName() {
			return streetName;
		}

		public void setStreetName(java.lang.String streetName) {
			this.streetName = streetName;
		}

		public java.lang.Integer getWipErrorCode() {
			return wipErrorCode;
		}

		public void setWipErrorCode(java.lang.Integer wipErrorCode) {
			this.wipErrorCode = wipErrorCode;
		}

}
