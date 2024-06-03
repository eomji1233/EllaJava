package org.ella.day12.collection.list;

public class GenericList<T> {
	Object [] objects;
	int size;
	
	public GenericList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T object) {
		objects[size] = object;
		size++;
	}
	
	public T get(int index) {
		return (T)objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void claer() {
		objects = new Object[3];
		size = 0;
	}
	
}
