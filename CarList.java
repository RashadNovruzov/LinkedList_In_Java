package linkedList;
import arraylist.Car;
import hashSet.CarCollection;

public interface CarList extends CarCollection {
	public Car get(int index);
//	public Car[] getAll();
	public boolean add(Car car);
	public boolean add(Car car,int index);
	public boolean remove(Car car);
	public boolean removeAt(int index);
	public int size();
	public void clear();
}
