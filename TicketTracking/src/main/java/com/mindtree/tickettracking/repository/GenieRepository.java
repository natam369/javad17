package com.mindtree.tickettracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.tickettracking.entity.Genie;

@Repository
public interface GenieRepository extends JpaRepository<Genie, Integer>{



}
