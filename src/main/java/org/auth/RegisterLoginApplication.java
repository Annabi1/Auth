package org.auth;

import java.util.Date;

import java.util.List;

import org.auth.model.Role;
import org.auth.model.RoleName;
import org.auth.model.User;
import org.auth.repository.RoleRepository;
import org.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
// Enable eureka client
@EnableEurekaClient
@SpringBootApplication
public class RegisterLoginApplication {

	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepo;
	@Autowired
	private RoleRepository repo;
	private RoleName name;

	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginApplication.class, args);

		System.out.print("\n");
		System.out.print("************************** App started **************************");
	}

	/*
	 * @Bean CommandLineRunner runner() { return args -> {
	 * 
	 * Role adminRole = new Role(name.ROLE_ADMIN, "Gérer les utilisateurs" +
	 * " ,Consulter les voyages" + "et Consulter les réservations des voyages");
	 * 
	 * Role voyageurRole = new Role(name.ROLE_VOYAGEUR,
	 * " Consulter la liste des voyages aériens ou maritime ( destination, date et heure de départ, s’il"
	 * + "y’a des escales ou non …)" + ", Réserver un voyage." +
	 * ", Consulter la liste de ses voyages réservé" + "et Annuler un voyage");
	 * 
	 * Role agentAerien = new
	 * Role(name.ROLE_VAGENT_AERIEN,"Ajouter les voyages aériens" +
	 * ", Consulter la liste de réservation des voyagemodificationss" +
	 * ", Annuler ou modifier la date du voyage ( dans ce cas un email sera envoyé aux personnes qui"
	 * + "et ont réservé ce voyage pour les informer de ces )");
	 * 
	 * Role agentMaritime = new
	 * Role(name.ROLE_VAGENT_MARITIME,"Ajouter les voyages maritimes" +
	 * ", Consulter la liste de réservation des voyages" +
	 * ", Annuler ou modifier la date du voyage ( dans ce cas un email sera envoyé aux personnes qui"
	 * + " et ont réservé ce voyage pour les informer de ces modifications)");
	 * 
	 * repo.saveAll(List.of(adminRole,voyageurRole, agentAerien, agentMaritime));
	 * 
	 * User user = new User(); user.setName("annabi");
	 * user.setEmail("annabi.mabrouka99@gmail.com"); user.setGender("femme");
	 * user.setEnabled(true); user.setBirthDate("06/09/1996");
	 * user.setUsername("mabrouka"); user.setCreateAt(new Date()); PasswordEncoder
	 * pass = new BCryptPasswordEncoder(); String password =
	 * pass.encode("mabrouka"); user.setPassword(password);
	 * user.getRoles().add(adminRole); userRepo.save(user); }; }
	 */
}
