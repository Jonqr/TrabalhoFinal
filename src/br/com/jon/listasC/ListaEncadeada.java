package br.com.jon.listasC;

import java.io.InputStream;
import java.util.Comparator;

public interface ListaEncadeada<T> {

	public void append(T dado) ;
	
	public void addFirst(T dado) ;
	
	public T search(Comparator<T> cmp) ;
	
	public void printObjects() ;
	
	public ListaEncadeada<Aluno> loadFromFile(InputStream input);
	
}
