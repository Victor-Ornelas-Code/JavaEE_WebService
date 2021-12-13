package br.com.javaee.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuario = new ArrayList<Usuario>();
	private static Integer chaveSequencial = 1;
    
	static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Caelum");
        lista.add(empresa);
        lista.add(empresa2);
        
        Usuario u1 = new Usuario();
        u1.setLogin("Victor");
        u1.setSenha("123456");
        
        Usuario u2 = new Usuario();
        u2.setLogin("Stella");
        u2.setSenha("123456");
        
        listaUsuario.add(u1);
        listaUsuario.add(u2);
    }
	
	
	
	public void adciciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
		
	}

	public void remove(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id) {
				it.remove();
			}
		}	
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
			
		}

		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuario) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}	
		}
		
		return null;
	}

	
}
