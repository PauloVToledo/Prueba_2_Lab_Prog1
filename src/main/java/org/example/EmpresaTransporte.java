import java.util.ArrayList;

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
		throw new UnsupportedOperationException();
	}

	public Conductor agregarConductor(String nombre, String apellido, int telefono, String tipoLicencia) {
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