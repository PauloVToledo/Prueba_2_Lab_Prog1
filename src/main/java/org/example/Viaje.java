package org.example;
public class Viaje {
	private String horaSalida;
	private String horaLlegada;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Ciudad getCiudad1() {
		throw new UnsupportedOperationException();
	}

	public Ciudad getCiudad2() {
		throw new UnsupportedOperationException();
	}

	public Viaje(Ciudad ciudad1, Ciudad ciudad2, String horaSalida, String horaLlegada) {
		this.horaLlegada=horaLlegada;
		this.horaSalida=horaSalida;
		this.ciudadDestino=ciudad2;
		this.ciudadOrigen=ciudad1;
		throw new UnsupportedOperationException();
	}
}