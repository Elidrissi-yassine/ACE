package com.example.Spring_GRAPHQL.repositories;

import com.example.Spring_GRAPHQL.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
