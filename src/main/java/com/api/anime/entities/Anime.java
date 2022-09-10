package com.api.anime.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anime")
public class Anime {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

String nombre;

String anio;

@Column(name = "fecha_ingreso")
LocalDate fechaIngreso;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getAnio() {
	return anio;
}

public void setAnio(String anio) {
	this.anio = anio;
}

public LocalDate getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(LocalDate fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}
}
