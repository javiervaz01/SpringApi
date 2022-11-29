package entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Contact {
	
    // // The class extends BaseEntity, a class I created that has an Id


	// @Column(name = "opportunity")
	// @ManyToOne
	// private Opportunity opportunity;
	@Id
	Integer id;

	//this boolean is like in Opportunity, just to avoid creating a new hole entity called
	//future action, that is just a contact but in the future.
	private boolean isFutureAction;

	private String action;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate date;

	public Contact(Integer id,boolean isFutureAction, String action, LocalDate date) {
		this.id=id;
		this.isFutureAction = isFutureAction;
		this.action = action;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public boolean isFutureAction() {
		return isFutureAction;
	}

	public String getAction() {
		return action;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFutureAction(boolean isFutureAction) {
		this.isFutureAction = isFutureAction;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	


}
