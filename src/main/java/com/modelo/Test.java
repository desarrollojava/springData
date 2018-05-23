/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
      Persona persona=new Persona(1,"Anibal","Caiza","Quito");
      IPersonaRepository rRepositorio=context.getBean(IPersonaRepository.class);
      rRepositorio.save(persona);
    }
    
}
