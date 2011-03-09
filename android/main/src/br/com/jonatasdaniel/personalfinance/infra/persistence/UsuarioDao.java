package br.com.jonatasdaniel.personalfinance.infra.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.jonatasdaniel.personalfinance.model.entity.Usuario;
import br.com.jonatasdaniel.personalfinance.model.repository.UsuarioRepository;


public class UsuarioDao extends Dao<Usuario, Integer> implements UsuarioRepository {

	private static List<Usuario> users = new ArrayList<Usuario>();
	
	{
		users.add(new Usuario("Usuário teste", "teste", "teste"));
	}
	
	@Override
	public Usuario findByLogin(String login) {
		for(Usuario user : users)
			if(user.getLogin().equals(login))
				return user;
		return null;
	}

}