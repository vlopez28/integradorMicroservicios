package com.integrador.service.dto.usuario;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties( ignoreUnknown = true )
public class UsuarioRequestDto {
	
	private Long id;
	private String apellido;
    private String nombre;
    private String email;
    private String celular;
    
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getCelular() {
		return celular;
	}
    
	public Long getId() {
		return id;
	}
	

}
