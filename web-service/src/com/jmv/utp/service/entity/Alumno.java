package com.jmv.utp.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "aca_alumno", uniqueConstraints = { @UniqueConstraint(columnNames = "alu_id") })
public class Alumno extends Usuario {

	@Column(name="alu_nombre")
	private String nombre;
	//private List<Matricula> matriculas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
