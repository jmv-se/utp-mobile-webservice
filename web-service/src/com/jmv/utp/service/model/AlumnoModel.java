package com.jmv.utp.service.model;

import org.hibernate.Session;

import com.jmv.utp.service.entity.Alumno;
import com.jmv.utp.service.hibernate.MySessionFactory;

public class AlumnoModel {

	public Alumno consultarAlumno(long id) {
		
		Session session = MySessionFactory.getSessionFactory().openSession();

		session.beginTransaction();

		Alumno alumno = (Alumno) session.get(Alumno.class, id);
		
		session.getTransaction().commit();

		System.out.println("Exito!!");
		
		return alumno;
	}
}
