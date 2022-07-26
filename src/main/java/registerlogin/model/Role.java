
package registerlogin.model;
import java.util.Optional;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class Role {


	    @Enumerated(EnumType.STRING)
	    @Id
	    @Column(length = 60)
	    private RoleName name;
	    @Column(length = 60)
	    private String description;
	    public Role() {}

	    public Role(RoleName name) {
	        this.name = name;
	    }
	    

	   	

			public Role(RoleName name, String description) {
			
		
			this.name = name;
			this.description = description;
		}

			
	 
	    public RoleName getName() {
	        return name;
	    }

	    public void setName(RoleName name) {
	        this.name = name;
	    }

		
}
