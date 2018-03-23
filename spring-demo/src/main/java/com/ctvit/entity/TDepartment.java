package com.ctvit.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_department database table.
 * 
 */
@Entity
@Table(name="t_department")
@NamedQuery(name="TDepartment.findAll", query="SELECT t FROM TDepartment t")
public class TDepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_DEPARTMENT_ID_GENERATOR", sequenceName="SEQ_T_DEPARTMENT_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_DEPARTMENT_ID_GENERATOR")
	private String id;

	private String name;

	public TDepartment() {
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