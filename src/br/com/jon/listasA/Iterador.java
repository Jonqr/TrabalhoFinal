package br.com.jon.listasA;

public interface Iterador<T> {

	boolean hasNext();
	boolean hasPrevious();
	T next();
	T previous();
	void addBefore(T dado);
	void addAfter(T dado);
	void remove();
	
}
