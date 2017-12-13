package br.com.jon.listasA;

import java.io.InputStream;
import java.util.Comparator;

public class ListaEncadeada<T> implements Iterador<T>{

	public void append(T dado) {
	}
	public void addFirst(T dado) {
	}
	public T search(Comparator<T> cmp) {
		return null;
	}
	public void printObjects() {
	}
	public static <T>ListaEncadeada<T> loadFromFile(InputStream input) {
		return null;
	}
//	public ListaEncadeada<T> filter(Filtro<T> filtro) {
//		return null;
//	}

	public Iterador<T> iterator() {
		return null;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addBefore(T dado) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addAfter(T dado) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
