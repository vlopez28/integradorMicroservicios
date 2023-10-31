package com.integrador.service.dto.cuenta;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import lombok.Data;

@Data
@JsonIgnoreProperties( ignoreUnknown = true )
public class CuentaRequestDto {

	private Long id;
	private double saldo;
    private Date fechaAlta;
    private boolean disponible;
    
    
    public Long getId() {
    	return id;
    }
    
    public boolean isDisponible() {
    	return disponible;
    }
    
	public double getSaldo() {
		return saldo;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
    
}
