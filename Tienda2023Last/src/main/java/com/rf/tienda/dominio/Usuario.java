package com.rf.tienda.dominio;

import java.time.LocalDate;

import javax.persistence.*;

import com.rf.tienda.exception.DomainException;
import com.rf.tienda.util.Validator;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_usuario;
	@Column(name = "nombre", nullable = false)
	private String user_nombre;
	@Column(name = "email", nullable = false, unique = true)
	private String user_email;
	@Column(name = "password", nullable = false)
	private String user_pass;
	@Column(name = "tipo", nullable = false)
	private int user_tipo;
	@Column(name = "dni")
	private String user_dni;

	private LocalDate user_fecAlta;
	private LocalDate user_fecConfirmacion;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name ="dir_nombre", column= @Column(name="dir_nombre_envio")),
	@AttributeOverride(name ="dir_direccion", column= @Column(name="dir_direccion_envio")),
	@AttributeOverride(name ="dir_poblacion", column= @Column(name="dir_poblacion_envio")),
	@AttributeOverride(name ="dir_cPostal", column= @Column(name="dir_cPostal_envio")),
	@AttributeOverride(name ="dir_provincia", column= @Column(name="dir_provincia_envio")),
	@AttributeOverride(name ="dir_pais", column= @Column(name="dir_pais_envio")),
	@AttributeOverride(name ="dir_correoE", column= @Column(name="dir_correoE_envio"))
	})
	private Direccion datos_pago;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name ="dir_nombre", column= @Column(name="dir_nombre_pago")),
	@AttributeOverride(name ="dir_direccion", column= @Column(name="dir_direccion_pago")),
	@AttributeOverride(name ="dir_poblacion", column= @Column(name="dir_poblacion")),
	@AttributeOverride(name ="dir_cPostal", column= @Column(name="dir_cPostal_pago")),
	@AttributeOverride(name ="dir_provincia", column= @Column(name="dir_provincia_pago")),
	@AttributeOverride(name ="dir_pais", column= @Column(name="dir_pais_pago")),
	@AttributeOverride(name ="dir_correoE", column= @Column(name="dir_correoE_pago"))
	})
	private Direccion datos_envio;

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		if(Validator.isEmailValido(user_email))
			this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public int getUser_tipo() {
		return user_tipo;
	}

	public void setUser_tipo(int user_tipo) {
		this.user_tipo = user_tipo;
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) throws DomainException {
		if (Validator.cumpleDNI(user_email))

			this.user_dni = user_dni;
		else
			throw new DomainException();
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta(String user_fecAlta) {
		if (Validator.esFechaValida(user_fecAlta)) {
			String[] aux = user_fecAlta.split("/");
			int anio = Integer.parseInt(aux[2]);
			int mes = Integer.parseInt(aux[1]);
			int dia = Integer.parseInt(aux[0]);
			this.user_fecAlta = LocalDate.of(anio, mes, dia);
		}
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(String user_fecConfirmacion) {
		if (Validator.esFechaValida(user_fecConfirmacion)) {
			String[] aux = user_fecConfirmacion.split("/");
			int anio = Integer.parseInt(aux[2]);
			int mes = Integer.parseInt(aux[1]);
			int dia = Integer.parseInt(aux[0]);
			this.user_fecConfirmacion = LocalDate.of(anio, mes, dia);
		}
	}

}
