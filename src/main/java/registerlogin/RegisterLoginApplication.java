package registerlogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import registerlogin.model.Role;
import registerlogin.model.RoleName;
import registerlogin.model.User;
import registerlogin.repository.RoleRepository;
import registerlogin.repository.UserRepository;

@SpringBootApplication
public class RegisterLoginApplication {
	
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	UserRepository userRepo;
	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginApplication.class, args);
		
		System.out.print("\n");
		System.out.print("App started ...");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
          //  roleRepository.deleteAll();
			Role adminRole = new Role(RoleName.ROLE_ADMIN,"manage everything");
			Role useRole = new Role(RoleName.ROLE_VOYAGEUR);
			roleRepository.save(adminRole);
			roleRepository.save(useRole);
			User user=new User();
			user.setName("annabi");
			user.setUsername("mabrouka");
			PasswordEncoder pass=new BCryptPasswordEncoder();
			String password=pass.encode("mabrouka");
			user.setPassword(password);
			user.getRoles().add(adminRole)		;
			userRepo.save(user);
		};
	}
}
