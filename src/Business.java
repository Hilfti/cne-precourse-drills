package myTest;

import java.util.ArrayList;
import java.util.List;

public class Business {
	private final String name;
	private ArrayList<Address> addresses = new ArrayList<Address>();

    public Business(String name)
	{
		this.name = name;
	}
     public String getName()
	{
		return name;
	}
    void addAddress(Address address)
	{
    	 addresses.add(address);
	}
    List<Address> getAddresses()
	{
		return addresses;
	}

}
