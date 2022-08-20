package CorridaCavalos;

// Atributos do Cavalo Branco
public class CavaloBranco implements ICavalos {
	@Override
	public int forca() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int aceleracao() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int velocidadeMaxima() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public int resistencia() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public int idade() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String raca() {
		// TODO Auto-generated method stub
		return "Cavalo Puro Sangue Inglês";
	}
}
