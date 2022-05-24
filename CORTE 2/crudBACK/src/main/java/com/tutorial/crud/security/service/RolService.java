package com.tutorial.crud.security.service;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolName;
import com.tutorial.crud.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolName rolName){
        return rolRepository.findByRolNombre(rolName);
    }

    public void Save( Rol rol){
        rolRepository.save(rol);
    }
}
