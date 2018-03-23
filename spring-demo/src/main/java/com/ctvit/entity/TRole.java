package com.ctvit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_role database table.
 * 
 */
@Entity
@Table(name="t_role")
@NamedQuery(name="TRole.findAll", query="SELECT t FROM TRole t")
public class TRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_ROLE_ID_GENERATOR", sequenceName="SEQ_T_ROLE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_ROLE_ID_GENERATOR")
	private String id;

	private String name;

	public TRole() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}