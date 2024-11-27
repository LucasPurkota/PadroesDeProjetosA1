package transporte;

import java.util.List;

public class Transporte {
	public Double peso = 100.00;
	public Double dimensoes = 10.00;
	public String localizacao = "";
	public String transportadora = "";
	private List<iTransporte> transportes= List.of(
            new TransporteTerrestre(),
            new TransporteAereo(),
            new TransporteMaritimo(),
            new EntregaPorDrones());

	
    public String escolheTransporte() {
    	
    	for(iTransporte transporte : transportes) {
    		if (transporte.podeTransportar(this)) {
    			return transporte.getTransporte();
    		}
    	}
    	return "Nenhum transporte disponível para as condições fornecidas.";
    }

	
}
