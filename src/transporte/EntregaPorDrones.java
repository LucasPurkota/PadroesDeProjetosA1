package transporte;

public class EntregaPorDrones implements iTransporte{

	@Override
	public boolean podeTransportar(Transporte transporte) {
		return transporte.localizacao.toLowerCase().contains("metropolitana") && transporte.peso < 2.00 && transporte.dimensoes < 1.0;
	}

	
	@Override
	public String getTransporte() {
		return "Drone";
	}
}
