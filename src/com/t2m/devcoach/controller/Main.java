/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.t2m.devcoach.controller;

import com.t2m.devcoach.model.Endereco;
import com.t2m.devcoach.model.Pessoa;
import com.t2m.devcoach.view.MenuFrame;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author master
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
    
//        EntityManagerFactory objFactory = Persistence.createEntityManagerFactory("t2mPU");
//            EntityManager manager = objFactory.createEntityManager();
//            PessoaJpaController jpa = new PessoaJpaController(objFactory);
//            EnderecoJpaController ejpa = new EnderecoJpaController(objFactory);
//            
//            Endereco endereco = new Endereco();
//            endereco.setRua("rua");
//            endereco.setBairro("bairro");
//            endereco.setNumero("22");
//            endereco.setCidade("Campinas");
//            endereco.setEstado("SP");
//            endereco.setPais("Brasil");
//            
//            ejpa.create(endereco);
//            
//            Pessoa pessoa = new Pessoa();
//            pessoa.setNome("Nome");
//            pessoa.setDocumento("asd");
//            pessoa.setDatanasc("1999-09-09");
//            pessoa.setEmail("mas@asd.com");
//            pessoa.setIdEndereco(endereco);
//            
//            jpa.create(pessoa);
        
        MenuFrame menuframe = new MenuFrame();
        menuframe.setLocationRelativeTo(null);
        menuframe.setVisible(true);

    }
}
