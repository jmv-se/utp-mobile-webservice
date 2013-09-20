package com.jmv.utp.service.entity;

import java.util.List;

public class Asignatura {
	
	private long id;
	private List<AsignaturaMatricula> asignaturasMatriculadas;
	private List<DocenteAsignado> docentesAsignados;
	private Seccion seccion;
	private CursoCarrera cursoCarrera;
}
