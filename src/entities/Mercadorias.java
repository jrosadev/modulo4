package entities;

public class Mercadorias {
	
	private String name;
	private double purchase;
	private double retail;
	
	public Mercadorias(String name, double purchase, double retail) {
		this.name = name;
		this.purchase = purchase;
		this.retail = retail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public double getRetail() {
		return retail;
	}

	public void setRetail(double retail) {
		this.retail = retail;
	}

}
