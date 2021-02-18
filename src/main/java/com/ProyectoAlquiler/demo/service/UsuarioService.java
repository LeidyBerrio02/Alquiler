package com.ProyectoAlquiler.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoAlquiler.demo.model.Rol;
import com.ProyectoAlquiler.demo.model.Usuario;
import com.ProyectoAlquiler.demo.repository.UsuarioRepository;

import lombok.extern.slf4j.Slf4j;

@Service("userDetailsService")
@Slf4j
public class UsuarioService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Usuario usuario = usuarioRepository.findByUsername(username);
			
			if (usuario == null) {
				throw new UsernameNotFoundException(username);
			}
			
			var roles = new ArrayList<GrantedAuthority>();
			
			//Trae los roles
			for (Rol rol : usuario.getRoles()) {
				roles.add(new SimpleGrantedAuthority(rol.getNombre()));
			}
			
		return new User(usuario.getUsername(), usuario.getPassword() , roles);
	}
}
