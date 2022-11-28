package linkedList;
import arraylist.Car;
import arraylist.CarArrayList;
import arraylist.CarList;
import java.util.ArrayList;
import java.util.List;
import hashSet.CarCollection;

public class Main {

	public static void main(String[] args) {
//		CarLinkedList2 cars = new CarLinkedList2();
//		
//		for(int i = 0; i < 13; i++) {
//			Car car = new Car("BMW",i);
//			cars.add(car);
//		}
//		
////		for(int j = 0; j < cars.size(); j++) {
////			Car car = cars.get(j);
////			System.out.println(car);
////		}
//		
//		Car deleteCar = new Car("BMW",5);
//		System.out.println(cars.remove(deleteCar));
//		for(int j = 0; j < cars.size(); j++) {
//			Car car = cars.get(j);
//			System.out.println(car);
//		}
		
		
		CarCollection cars = new CarArrayList();
		
		for(int i = 0; i < 10; i++) {
			cars.add(new Car("Brand "+ i,i));
		}
		
//		while(cars.iterator().hasNext()) {
//			Car car = cars.iterator().next(); так работает foreach
//		}
		
		for(Car car:cars) {
			System.out.println(car);
		}
//		for(Car car : cars.getAll()) {
//			System.out.println(car);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
