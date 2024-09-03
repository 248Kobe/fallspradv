package com.ecj.fallspradv.repository;

import com.ecj.fallspradv.domain.Tbuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbuserRepository extends JpaRepository<Tbuser, String> {
    Tbuser findByUsername(String username);
    Tbuser findByUsernameAndPassword(String username, String password);
}
