package org.example;
import java.util.ArrayList;
import java.util.List;

//Solo falta especificar las funcionalidades y darle código a cada una.

public class EmpresaTransporte {
	private String rut;
	private String id;
	private String redesSociales;
	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public EmpresaTransporte(String rut, String id, String redesSociales) {
		throw new UnsupportedOperationException();
	}

	public Bus agregarBus(String patente, String marca, String modelo) {
		Bus bus1 = new Bus(patente, marca, modelo);
		buses.add(bus1);
		Bus bus2 = new Bus(patente, marca, modelo);
		buses.add(bus2);
		Bus bus3 = new Bus(patente, marca, modelo);
		buses.add(bus3);

		throw new UnsupportedOperationException();
	}

	public Conductor agregarConductor(String nombre, String apellido, int telefono, String tipoLicencia) {

		Conductor conductor1 = new Conductor(nombre, apellido, telefono, tipoLicencia);


		throw new UnsupportedOperationException();
	}

	public Bus asociarViajeBus(String horaSalida, String horaLlegada, Ciudad ciudad1, Ciudad ciudad2) {
		throw new UnsupportedOperationException();
	}

	public void mostrarBusesViajando(ArrayList<Bus> buses) {
		throw new UnsupportedOperationException();
	}

	public List<Bus> getBuses() {
		throw new UnsupportedOperationException();
	}


}