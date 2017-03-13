package myTest;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("4933 Xanthia St","Denver","CO","80238");
		Address address2 = new Address("43 Xania St","Denver","CO","80238");
		System.out.println(address1.toString());
		
		Business business = new Business("FashionMia");
		System.out.println(business.getName());
		business.addAddress(address1);
		business.addAddress(address2);
		
		System.out.print(business.getAddresses().toString());
	}

}
