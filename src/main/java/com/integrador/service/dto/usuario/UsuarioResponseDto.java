package com.integrador.service.dto.usuario;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.integrador.domain.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UsuarioResponseDto {

	private final Long id;
    private final String nombre;
    private final String apellido;
	private final String celular;
	private final String email;
	
	
    
	public UsuarioResponseDto(Usuario u ) {
        this.id = u.getId();
        this.nombre = u.getNombre();
        this.apellido = u.getApellido();
        this.celular = u.getCelular();
        this.email = u.getEmail();
	}
	
	
}
