/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.mediaTech.dao;

import com.fstg.mediaTech.bean.Client;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yassine
 */
@Repository
public interface IClientDao extends JpaRepository<Client, Long> {
    @Query("select c from Client c where c.nom like:x ")
    public List<Client> findBymotCle(@Param("x")String motCle);
    
    
 

}
