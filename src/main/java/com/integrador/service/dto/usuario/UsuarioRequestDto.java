package com.integrador.service.dto.usuario;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.integrador.domain.Cuenta;

import lombok.Data;

@Data
@JsonIgnoreProperties( ignoreUnknown = true )
public class UsuarioRequestDto implements Serializable{
	
	private Long id;
	private String apellido;
    private String nombre;
    private String email;
    private String celular;
    private List<Cuenta> cuentas;
    
    
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
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
