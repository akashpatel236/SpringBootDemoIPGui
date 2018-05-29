function validate() {
	var telephonenumber = document.getElementById("telephonenumber").value;
	var currentfuture = document.getElementById("currentfuture").value;
	var postalcode = document.getElementById("postalcode").value;
	var housenumber = document.getElementById("housenumber").value;
	if (telephonenumber == '') {
		alert('Please enter a valid Telephone Number.');
		return false;
	}
	if (currentfuture == '') {
		alert('Please select a Current/ Future value.');
		return false;
	}
	if (postalcode == '') {
		alert('Please enter a valid Postal Code.');
		return false;
	}
	if (housenumber == '') {
		alert('Please enter a valid House Number.');
		return false;
	}else {
		return true;
	}
}