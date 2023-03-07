package com.collections.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import com.collections.arraylist.Car;

class Arraylist1 {
    public static void main(String[] args) {
        //demo1();
    	demo2();
    }

    
    
	private static void demo2() {

		ArrayList<Car> cars = new ArrayList<Car>();
		
		for (int i =0;i <10;i++) {
			Car car1 = new Car();
			cars.add(car1);
			
			car1.setBrand("Maruti"+i);
			car1.setPrice(i*1000);
		}
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println(cars);
	}

	


	private static void demo1() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Hyundai");
		cars.add("Mahindra");
		cars.add("BMW");
		System.out.println(cars);
		
		cars.set(0,"Maruti");
		System.out.println(cars);
		
		for(int i = 0;i < cars.size();i++){
		    System.out.println(cars.get(i));
		}
		
		Collections.sort(cars);
		for (String car : cars) {
			System.out.println(car);
			
		}
		
		//cars.remove(1);
		//System.out.println(cars);
		
		//cars.clear();
		//System.out.println(cars);
	}
}












