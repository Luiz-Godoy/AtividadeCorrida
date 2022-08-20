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
	
	public int forca() {
		return this.cavalo.forca();
	}
	
	public int aceleracao() {
		return this.cavalo.aceleracao();
	}
	
	public int velocidadeMaxima() {
		return this.cavalo.velocidadeMaxima();
	}
	
	public int resistencia() {
		return this.cavalo.resistencia();
	}
	
	public int idade() {
		return this.cavalo.idade();
	}
	
	@SuppressWarnings("unchecked")
	public string raca() {
		return (string) this.cavalo.raca();
	}
	
	@SuppressWarnings("unchecked")
	public string nome() {
		return (string) this.medicos.nome();
	}
	
	@SuppressWarnings("unchecked")
	public string sexo() {
		return (string) this.medicos.sexo();
	}
	
	public int NivelHabilidade() {
		return this.medicos.NivelHabilidade();
	}
}
