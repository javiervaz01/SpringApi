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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isFutureAction ? 1231 : 1237);
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isFutureAction != other.isFutureAction)
			return false;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

	


}
