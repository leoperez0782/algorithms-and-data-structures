package com.github.leoperez0782.ayed.tads.list;

public class ListImplementation<T> implements IList<T> {

	private int size = 0;
	private Node<T> first;
	private Node<T> last;

	@Override
	public boolean add(T element) {
		if (this.isEmpty()) {
			return addFirst(element);
		}
		Node<T> node = new Node<T>(element);
		this.last.setNext(node);
		this.last = node;
		this.size++;
		return true;
	}

	@Override
	public boolean isEmpty() {
		return this.first == null;
	}

	@Override
	public void clear() {
		this.first = null;
		this.size = 0;
	}

	@Override
	public boolean remove(T element) {
		Node<T> aux = this.first;
		Node<T> prev = aux;
		if (aux.getElement() == element) {
			return removeFirst();
		}
		while (aux != null && aux.getElement() != element) {
			prev = aux;
			aux = aux.getNext();
		}
		if (aux != null && aux.getElement() == element) {
			prev.setNext(aux.getNext());
			size--;
			return true;
		}
		return false;
	}

	private boolean removeFirst() {
		if (this.first != null) {
			this.first = this.first.getNext();
			size--;
		}
		return true;
	}

	@Override
	public T get(int index) {
		if (index >= size || index < 0)
			return null;
		int counter = 0;
		Node<T> aux = this.first;
		while (aux != null && counter != index) {
			aux = aux.getNext();
			counter++;
		}
		return aux == null ? null : aux.getElement();
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean addFirst(T element) {
		Node<T> newNode = new Node<T>(element);
		newNode.setNext(this.first);
		this.first = newNode;
		if (this.last == null) {
			this.last = this.first;
		}
		this.size++;
		return true;
	}
	

}
