package linkedList;

public class Car {
	private String brand;
	private int number;
	
	public Car(String brand, int number) {
		this.brand = brand;
		this.number = number;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public int getNum() {
		return this.number;
	}
	
	@Override
	public String toString() {
		return "brand: "+this.brand+"\nnumber: "+this.number;
	}
	
}
