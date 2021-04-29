package datamodel.entities;

// default package
// Generated 28 abr. 2021 20:42:37 by Hibernate Tools 5.4.30.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Roles generated by hbm2java
 */
public class Roles implements java.io.Serializable {

	private Integer id;
	private String rol;
	private Set usuarioses = new HashSet(0);

	public Roles() {
	}
	
	public Roles(String rol) {
		this.rol = rol;
	}

	public Roles(String rol, Set usuarioses) {
		this.rol = rol;
		this.usuarioses = usuarioses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Set getUsuarioses() {
		return this.usuarioses;
	}

	public void setUsuarioses(Set usuarioses) {
		this.usuarioses = usuarioses;
	}

}
