package aug30;

public class CustomerDetails implements BonusPoints,DoorDelivery {
	private String customerName;
	private String phoneNumber;
	private String StreetName;
	private double billAmount;
	private int distance;
	
	public CustomerDetails() {
		super();
	}

	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.StreetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public double calculateBonusPoints() {
		if(billAmount>=250) {
			double bonuspoints=billAmount/10;
			return bonuspoints;
		}
		else {
			return 0;
		}
	}

	@Override
	public double deliveryCharge() {
		// TODO Auto-generated method stub
		if(distance>=25) {
			return distance*8;
		}
		else if(distance>=15) {
			return distance*5;
		}
		else {
			return distance*2;
		}
	}

	@Override
	public String toString() {
		return "customerName:" + customerName + "\nphoneNumber:" + phoneNumber + "\nStreetName:"
				+ StreetName + "\nBonusPoints:" + calculateBonusPoints() + "\nDeliveryCharge:" +deliveryCharge();
	}
	
	
}
