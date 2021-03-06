package es.upm.dit.isst.inspector.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="inspectores")
public class Inspector implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="email")
	private String email;
	private String name;
	private String password;
	private boolean autorizado;

	@OneToMany(mappedBy = "inspector")
	private Collection<Inspeccion> inspeccioneshechas;

	@OneToMany(mappedBy = "inspector")
	private Collection<Inspeccion> inspeccionesprogramadas;

	@OneToMany(mappedBy = "inspector")
	private Collection<Incidencia> incidenciasarevisar;

	@OneToMany(mappedBy = "inspector")
	private Collection<Incidencia> incidenciasrevisadas;
	
	@ManyToOne
	private Inspector inspector;
	
	public Inspector() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public Collection<Inspeccion> getInspeccioneshechas() {
		return inspeccioneshechas;
	}

	public Collection<Inspeccion> getInspeccionesprogramadas() {
		return inspeccionesprogramadas;
	}

	public Collection<Incidencia> getIncidenciasarevisar() {
		return incidenciasarevisar;
	}

	public Collection<Incidencia> getIncidenciasrevisadas() {
		return incidenciasrevisadas;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public void setInspeccioneshechas(Collection<Inspeccion> inspeccioneshechas) {
		this.inspeccioneshechas = inspeccioneshechas;
	}

	public void setInspeccionesprogramadas(Collection<Inspeccion> inspeccionesprogramadas) {
		this.inspeccionesprogramadas = inspeccionesprogramadas;
	}

	public void setIncidenciasarevisar(Collection<Incidencia> incidenciasarevisar) {
		this.incidenciasarevisar = incidenciasarevisar;
	}

	public void setIncidenciasrevisadas(Collection<Incidencia> incidenciasrevisadas) {
		this.incidenciasrevisadas = incidenciasrevisadas;
	}

	@Override
	public String toString() {
		return "Inspector [email=" + email + ", name=" + name + ", password=" + password + ", autorizado=" + autorizado
				+ ", inspeccioneshechas=" + inspeccioneshechas + ", inspeccionesprogramadas=" + inspeccionesprogramadas
				+ ", incidenciasarevisar=" + incidenciasarevisar + ", incidenciasrevisadas=" + incidenciasrevisadas
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Inspector other = (Inspector) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
