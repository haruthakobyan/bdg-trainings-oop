package com.bdg.vkaramyan.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListImpl<E> implements Collection<E>, Iterator<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	

	@Override
	public int size() {
		for (Node<E> n = head; n.next != null; n = n.next) {
			size++;

		}
		return size;
	}
	

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		for(E item : this) {
			if(o == null ? item == null : o.equals(item)) {
				
					return true;
				
			}
		}
		
		return false;
	}
	

	@Override
	public Iterator<E> iterator() {
		
		return new LinkedListImpl();
	}
	

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		int i = 0;
		for (E item : this) {
			array[i] = item;
			i++;
		}
			
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		T[] result = a;
		if(size() > result.length) {
			result = T[size()];
		}
		
		int i = 0;
		for (E item : this) {
			result [i] = item;
			i++;
		}
		
		if (result.length > i) {
			result[i] = null;
		}
		
		
		return (T[]) result;
	}

	@Override
	public boolean add(E item) {
		
		Node<E> newnode = new Node<>(item);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}else {
			tail.next = newnode;
			tail = newnode;
		}
		
		return true;
	}

	@Override
	public boolean remove(Object o) {
		Iterator<E> iterator = this.iterator();
		
		while(iterator.hasNext()) {
			E e = iterator.next();
			
			if(o == null ? e == null : o.equals(e)) {
				iterator.remove();
				return true;
			}
		}
		
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		Iterator<?> e = c.iterator();
		while(e.hasNext()) {
			if(!contains(e.next())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		for (int i = 0; i < c.size(); i++) {
			for(Iterator<? extends E> iterator = c.iterator(); iterator.hasNext();) {
				if(!add((E)iterator.next())) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		
		this.head = null;

	}


	@Override
	public boolean hasNext() {
		
		return head != null;
	}


	@Override
	public E next() {
		
		if(head == null) {
			throw new NoSuchElementException();
			
		}
		
		head = head.getNext();
		
		return next();
	}

}
