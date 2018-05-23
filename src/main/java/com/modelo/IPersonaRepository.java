/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaRepository extends JpaRepository<Persona, Serializable> {

    @Query("select t from Persona t "
            + " where t.idPersona=?1")
    List<Persona> obtenerPersonas(int id);
}
