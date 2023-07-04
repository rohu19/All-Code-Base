package sp.o;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	private Integer id;
	private Date date;

	@ManyToOne
	private SwimmingPool swimmingPool;
	@ManyToOne
	private Customer customer;

}
//One Owner have multiple have swimming pools.
//One Customer can book any number of bookings multiple bookings .
//multiple booking in the same swing pool 
//Mutlipe bookings by one Customer
