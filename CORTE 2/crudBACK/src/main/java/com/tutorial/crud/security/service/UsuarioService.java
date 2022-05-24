package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.User;
import com.tutorial.crud.security.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    RepositoryUser userRepository;

    public Optional<User> getByNombreUsuario(String nombreUsuario){
        return userRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreusuario(String nombreUsuario){
        return userRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public  void save(User user){
        userRepository.save(user);
    }
}
