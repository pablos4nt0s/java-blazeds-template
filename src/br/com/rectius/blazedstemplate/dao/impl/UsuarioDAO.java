package br.com.rectius.blazedstemplate.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

import br.com.rectius.blazedstemplate.dao.IUsuarioDAO;
import br.com.rectius.blazedstemplate.domains.Usuario;

@Service("usuarioService")
@RemotingDestination
public class UsuarioDAO implements IUsuarioDAO {
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory factory) {
		sessionFactory = factory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findAll() {
		return sessionFactory.getCurrentSession().createQuery("select m from Usuario m").list();
	}

	@Override
	public List<Usuario> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario create(Usuario item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Usuario item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Usuario item) {
		// TODO Auto-generated method stub
		return false;
	}

}
