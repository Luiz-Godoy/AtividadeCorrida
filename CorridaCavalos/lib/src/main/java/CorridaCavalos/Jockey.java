package CorridaCavalos;

public class Jockey <string> {
	ICavalos cavalo;
	IMedicos medicos;
	ICorredores jockeys;
	
	public Jockey(ICavalos c, IMedicos e, ICorredores j) {
		this.cavalo = c;		
		this.medicos = e;
		this.jockeys = j;
	}
}
