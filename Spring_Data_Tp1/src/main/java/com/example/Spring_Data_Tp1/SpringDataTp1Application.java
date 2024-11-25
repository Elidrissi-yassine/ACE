package com.example.Spring_Data_Tp1;

import com.example.Spring_Data_Tp1.enums.Genre;
import com.example.Spring_Data_Tp1.model.Etudiant;
import com.example.Spring_Data_Tp1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataTp1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataTp1Application.class, args);
	}
	@Autowired
	EtudiantRepository etudiantRepository;
	@Override
	public void run(String... args) throws Exception {
		Etudiant et1=Etudiant.builder()
				.nom("Adnani")
				.prenom("Morad")
				.genre(Genre.Homme)
				.build();
		etudiantRepository.save(et1);
	}
}
