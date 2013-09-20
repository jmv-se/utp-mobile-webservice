package com.jmv.utp.service.entity;

import javax.persistence.Id;

public class Usuario {

	@Id
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}