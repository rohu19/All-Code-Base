package sp.o;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class SwimmingPool {
	@Id
	private Integer id;
	private String title;

	@ManyToOne
	private Owner owner;

	@OneToMany(mappedBy = "swimmingPool ")
	private Set<Booking> bookings = new HashSet<>();
	
	
	
	
}
