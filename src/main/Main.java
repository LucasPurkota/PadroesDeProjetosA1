package main;

import transporte.Transporte;
import transporte.iTransporte;

public class Main {

	public static void main(String[] args) {
		Transporte terrestre = new Transporte();
		terrestre.transportadora = "transportadora";
		
        String tipoTransporte = terrestre.escolheTransporte();
        System.out.println("Tipo de transporte selecionado: " + tipoTransporte);
	
		Transporte aereo = new Transporte();
		aereo.peso =  20.00;
		aereo.dimensoes =  2.00;
		
		tipoTransporte = aereo.escolheTransporte();
		System.out.println("Tipo de transporte selecionado: " + tipoTransporte);
        
		
		Transporte maritimo = new Transporte();
		maritimo.localizacao = "internacional";
		
		tipoTransporte = maritimo.escolheTransporte();
		System.out.println("Tipo de transporte selecionado: " + tipoTransporte);
        
		
		Transporte drone = new Transporte();
		drone.localizacao = "metropolitana";
		drone.peso = 1.0;
		drone.dimensoes = 0.5;
		
		tipoTransporte = drone.escolheTransporte();
		System.out.println("Tipo de transporte selecionado: " + tipoTransporte);
        
		
		Transporte transporte = new Transporte();
		transporte.peso = 100.00;
		transporte.dimensoes = 10.00;
		
		tipoTransporte = transporte.escolheTransporte();
		System.out.println("Tipo de transporte selecionado: " + tipoTransporte);

	}
	
	

}
