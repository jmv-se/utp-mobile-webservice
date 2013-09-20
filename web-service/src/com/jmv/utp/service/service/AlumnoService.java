package com.jmv.utp.service.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.jmv.utp.service.entity.Alumno;
import com.jmv.utp.service.model.AlumnoModel;

@Path("/")
public class AlumnoService {

	@GET
	@Path("/alumnos/{id}")
	@Produces("application/json")
	public String consultarAlumno(@PathParam("id") long id) {

		String alumnoJSON = null;

		try {

			// Proceso
			AlumnoModel alumnoModel = new AlumnoModel();
			Alumno alumno = new Alumno();
			alumno = alumnoModel.consultarAlumno(id);

//			alumno.setId(13);
//			alumno.setNombre("Mario");

			// conversion a Json
			Gson gson = new Gson();
			alumnoJSON = gson.toJson(alumno);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("error");
		}
		return alumnoJSON;
	}
}
