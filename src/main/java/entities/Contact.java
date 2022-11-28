package entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name ="Contacts")
public class Contact  extends BaseEntity{
	
    // // The class extends BaseEntity, a class I created that has an Id


	// @Column(name = "opportunity")
	// @ManyToOne
	// private Opportunity opportunity;
	

	//this boolean is like in Opportunity, just to avoid creating a new hole entity called
	//future action, that is just a contact but in the future.
	@Column(name = "is_future_action")
	private boolean isFutureAction;

	private String action;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate date;

	public Contact(boolean isFutureAction, String action, LocalDate date) {
		this.isFutureAction = isFutureAction;
		this.action = action;
		this.date = date;
	}

	


}
