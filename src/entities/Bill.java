package entities;

public class Bill {
	
	private Character gender;
	private Integer beer;
	private Integer softDrink;
	private Integer barbecue;
	
	public Bill() {
	}

	public Bill(Character gender, Integer beer, Integer softDrink, Integer barbecue) {
		this.gender = gender;
		this.beer = beer;
		this.softDrink = softDrink;
		this.barbecue = barbecue;
	}

	public Character getGender() {
		return gender;
	}

	public Integer getBeer() {
		return beer;
	}

	public Integer getSoftDrink() {
		return softDrink;
	}

	public Integer getBarbecue() {
		return barbecue;
	}
	
	public Double feeding() {
		return beer * 5.0 + softDrink * 3.0 + barbecue * 7.0;
	}
	
	public Double cover() {
		if(feeding() > 30.0) {
			return 0.0;
		} else {
			return 4.0;
		}
	}
	
	public Double ticket() {
		if(gender == 'F') {
			return 8.0;
		} else {
			return 10.0;
		}
	}
	
	public Double total() {
		return feeding() + cover() + ticket();
	}

}
