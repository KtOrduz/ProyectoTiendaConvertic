package com.proyecto.convertic.repositorios;

import com.proyecto.convertic.entidades.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RegistroRepositorio extends JpaRepository <Registro, Integer> {
}
