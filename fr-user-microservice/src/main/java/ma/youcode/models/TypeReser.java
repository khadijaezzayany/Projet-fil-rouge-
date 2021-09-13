package ma.youcode.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typeReservation")
public class TypeReser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_typeReservation")
	private Long id;
	@Column(nullable = false)
	private String typeRes;
	@Column(nullable = false)
	private int nomberPlaces;

//    @OneToOne(mappedBy = "typeRes")
//    private Reservation resrvation;

	public TypeReser() {
		super();
	}

	public TypeReser(String typeRes, int nomberPlaces) {
		super();
		this.typeRes = typeRes;
		this.nomberPlaces = nomberPlaces;
	}

	public TypeReser(Long id, String typeRes, int nomberPlaces) {
		super();
		this.id = id;
		this.typeRes = typeRes;
		this.nomberPlaces = nomberPlaces;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeRes() {
		return typeRes;
	}

	public void setTypeRes(String typeRes) {
		this.typeRes = typeRes;
	}

	public int getNomberPlaces() {
		return nomberPlaces;
	}

	public void setNomberPlaces(int nomberPlaces) {
		this.nomberPlaces = nomberPlaces;
	}

}
