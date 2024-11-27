package transporte;

public class TransporteTerrestre implements iTransporte{

	@Override
	public boolean podeTransportar(Transporte transporte) {
		return !transporte.transportadora.isEmpty();
	}

	@Override
	public String getTransporte() {
		return "Terrestre";
	}
}
