package org.example;
public class Conductor {
	private String nombre;
	private String apellido;
	private int telefono;
	private String tipoLicencia;
	private Bus bus;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public Conductor(String nombre, String apellido, int telefono, String tipoLicencia) {
		throw new UnsupportedOperationException();
	}
}