package com.abc.clientecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.clientecrud.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
