package interfaceConcepts;

public interface BillingInfo extends AddToCart{
	
	public String paymentType (String type);

	public void cardNumber (String number);

	public void cardHolderName (String fname, String lname);
	
	public void CVV(int cvv);
	
	public void expirydate(String month, String year);
	
	// interface extends interface
	//class extends class
	// class implements interface...n
	// class extends class implements interface...n

}
