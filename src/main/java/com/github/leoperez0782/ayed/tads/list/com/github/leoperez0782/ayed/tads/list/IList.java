package com.github.leoperez0782.ayed.tads.list;

public interface IList<T> {
	
	/*
	 * Adds the element at first place
	 */
	boolean addFirst(T element);
	
	/**
	 * Adds the element at the end.
	 * @param element
	 * @return
	 */
	boolean add(T element);
	
	boolean isEmpty();
	
	/**
	 * Removes all elements.
	 */
	void clear();
	
	boolean remove(T element);
	
	/**
	 * Return the element of given index, or null if the element/index does not exists.
	 * @param index
	 * @return
	 */
	T get(int index);
	
	int size();
	
}
