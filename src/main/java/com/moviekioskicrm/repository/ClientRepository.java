package com.moviekioskicrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviekioskicrm.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{


}
