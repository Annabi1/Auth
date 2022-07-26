package registerlogin;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import registerlogin.model.Role;
import registerlogin.model.RoleName;
import registerlogin.repository.RoleRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;


@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)

public class RoleTests {
	@Autowired
	private RoleRepository repo;
	private RoleName name;
	@Test
	public void testCreateFirstProfil() {
		Role admin = new Role( name.ROLE_ADMIN,"manage everything");	
			Role profilSaved = repo.save(admin);
			
		
	
}

}
