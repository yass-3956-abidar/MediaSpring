/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.dao;

import com.fstg.mediaTech.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yassine
 */
@Repository
public interface IClientDao extends JpaRepository<Client, Long> {
    
    
 

}
