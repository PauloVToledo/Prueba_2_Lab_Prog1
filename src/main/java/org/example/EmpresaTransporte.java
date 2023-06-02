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
}