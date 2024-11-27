package transporte;

public class TransporteAereo implements iTransporte{

	@Override
	public boolean podeTransportar(Transporte transporte) {
		return transporte.peso < 50.00 && transporte.dimensoes < 3.00;
	}

	@Override
	public String getTransporte() {
		return "Aereo";
	}
}
