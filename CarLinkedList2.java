package linkedList;
import java.util.Iterator;

import arraylist.Car;


public class CarLinkedList2 implements CarList {
	Node first;
	Node last;
	int size = 0;

	@Override
	public Car get(int index) {
		return getNode(index).value;
	}

	@Override
	public boolean add(Car car) {
		if(size == 0) {
			Node newNode = new Node(null,car,null);
			first = newNode;
			last = newNode;
		}else {
			Node secondLast = last;
			last = new Node(secondLast,car,null);
			secondLast.next = last;
		}
		size++;
		return true;
		
	}

	@Override
	public boolean add(Car car, int index) {
		
		if(index == size) {
			add(car);
			return true;
		}
		
		Node nodeNext = getNode(index);
		Node nodePrevious = nodeNext.previous;
		Node newNode = new Node(nodePrevious,car,nodeNext);
		
		if(nodePrevious != null) {
			nodePrevious.next = newNode;
		} else {
			first = newNode;
		}
		
		nodeNext.previous = newNode;
		
		size++;
		return true;
	}

	@Override
	public boolean remove(Car car) {
		Node node = first;
		for(int i = 0; i < size; i++) {
			Car car2 = node.value;
			if(car.getBrand().equals(car2.getBrand()) && car.getNum()==car2.getNum()) {
				return removeAt(i);
			}
			node = node.next;
		}
		return false;
	}

	@Override
	public boolean removeAt(int index) {
		Node currentNode = getNode(index);
		Node nodePrevious = currentNode.previous;
		Node nextNode = currentNode.next;
		if(nodePrevious != null) {
			nodePrevious.next = nextNode;
		} else {
			first = nextNode;
		}
		
		if(nextNode != null) {
			nextNode.previous = nodePrevious;
		} else {
			last = nodePrevious;
		}
		size--;
		return true;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void clear() {
		this.first = null;
		this.last = null;
		this.size = 0;
		
	}
	
	@Override
	public boolean contains(Car car) {
		Node current = first;
		while(current != null) {
			if(current.value.equals(car)) {
				return true;
			}
			current = current.next;
		}
		return true;
	}
	
	@Override
	public Iterator<Car> iterator() {
		
		return new Iterator<Car>() {
			Node node = first;
			Car car = node.value;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return node != null;
			}

			@Override
			public Car next() {
				node = node.next;
				return car;
			}
			
		};
	}
	private class Node {
		
		private Node previous;
		private Car value;
		private Node next;
		
		public Node(Node previous, Car value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}
	
	private Node getNode(int index) {
		
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node node = first;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

}
