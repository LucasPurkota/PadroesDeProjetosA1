package transporte;

public class TransporteMaritimo implements iTransporte{

	@Override
	public boolean podeTransportar(Transporte transporte) {
		return transporte.localizacao.toLowerCase().contains("internacional");
	}

	@Override
	public String getTransporte() {
		return "Maritimo";
	}
}
