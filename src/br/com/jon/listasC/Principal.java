	package br.com.jon.listasC;

import java.io.FileReader;
import java.util.Collections;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		Lista<Aluno> listaAlunos = new Lista<Aluno>();
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setCidade("blumenau");
		aluno1.setEmail("aluno1@aluno1");
		aluno1.setEmpresa("Empresa A");
		aluno1.setIdade("10");
		aluno1.setMatricula("00001");
		aluno1.setNome("Aluno 1");
		aluno1.setSexo("Masculino");
		
		listaAlunos.append(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setCidade("blumenau");
		aluno2.setEmail("aluno2@aluno");
		aluno2.setEmpresa("Empresa A");
		aluno2.setIdade("11");
		aluno2.setMatricula("00002");
		aluno2.setNome("Aluno 2");
		aluno2.setSexo("Masculino");
		
		listaAlunos.append(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setCidade("Indaial");
		aluno3.setEmail("aluno3@aluno");
		aluno3.setEmpresa("Empresa B");
		aluno3.setIdade("12");
		aluno3.setMatricula("00003");
		aluno3.setNome("Aluno 3");
		aluno3.setSexo("Masculino");
		
		listaAlunos.append(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.setCidade("Indaial");
		aluno4.setEmail("aluno4@aluno");
		aluno4.setEmpresa("Empresa c");
		aluno4.setIdade("12");
		aluno4.setMatricula("00004");
		aluno4.setNome("Aluno 4");
		aluno4.setSexo("Feminino");
		
		listaAlunos.append(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.setCidade("Pomerode");
		aluno5.setEmail("aluno5@aluno");
		aluno5.setEmpresa("Empresa B");
		aluno5.setIdade("15");
		aluno5.setMatricula("00005");
		aluno5.setNome("Aluno 5");
		aluno5.setSexo("Feminino");
		
		listaAlunos.append(aluno5);	
		
		
		
		listaAlunos.printObjects();

		
		
		
		
		
	}

}
