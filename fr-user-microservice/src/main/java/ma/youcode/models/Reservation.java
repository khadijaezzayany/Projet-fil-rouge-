package ma.youcode.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reservation")
	private Long id;
	
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(nullable = false, name = "dateReservation")
	private Date dateRes;
	private boolean confirmation = false;

	@OneToOne
	@JoinColumn(name = "id_typeReservation")
	private TypeReser typeRes;

	public Reservation() {
		super();
	}

	public Reservation(User user, Date dateRes, boolean confirmation, TypeReser typeRes) {
		super();
		this.user = user;
		this.dateRes = dateRes;
		this.confirmation = confirmation;
		this.typeRes = typeRes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateRes() {
		return dateRes;
	}

	public void setDateRes(Date dateRes) {
		this.dateRes = dateRes;
	}

	public boolean isConfirmation() {
		return confirmation;
	}

	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}

	public TypeReser getTypeRes() {
		return typeRes;
	}

	public void setTypeRes(TypeReser typeRes) {
		this.typeRes = typeRes;
	}

}