package com.collections.arraylist;

public class Car implements Comparable<Car> {
	private String brand;
	private float price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int compareTo(Car car) {
		return (int) ((this.price) - car.getPrice());
	}
	
	@Override
	public String toString() {
		return Float.toString(price);
	}
	
	

}
