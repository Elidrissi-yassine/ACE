package com.example.Spring_GRAPHQL.Controllers;

import com.example.Spring_GRAPHQL.models.Centre;
import com.example.Spring_GRAPHQL.models.Etudiant;
import com.example.Spring_GRAPHQL.repositories.CentreRepository;
import com.example.Spring_GRAPHQL.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EtudiantGraphQLController {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;
    @QueryMapping
    public List<Etudiant> listEtudiants(){
        return etudiantRepository.findAll();
    }
    @QueryMapping
    public Etudiant getEtudiantById(@Argument Long id){
        return etudiantRepository.findById(id).orElseThrow(
                ()->new RuntimeException(String.format("etudiant %d non trouvé ",id))
        );
    }@QueryMapping
    public List<Centre> centres(){
        return centreRepository.findAll();
    }
    @QueryMapping
    public Centre getCentreById(@Argument Long id){
        return centreRepository.findById(id).orElseThrow(
                ()->new RuntimeException(String.format("Centre %s non trouvé ",id))
        );
    }
}
