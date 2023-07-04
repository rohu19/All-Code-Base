package sp.o;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	private Integer Id;
	private String firstName;

	@OneToMany(mappedBy = "owner")
	private Set<SwimmingPool> swimmingPool = new HashSet<>();

}
