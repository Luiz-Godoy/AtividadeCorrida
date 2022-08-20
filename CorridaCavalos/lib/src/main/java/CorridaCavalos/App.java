package CorridaCavalos;

public class App {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Jockey JockeyAlemanha = new Jockey(new CavaloPreto(), new MedicoAmericano(), 
				new CorredorAlemao());
		Jockey JockeyBrasil = new Jockey(new CavaloBranco(), new MedicoPolones(), 
				new CorredorBrasileiro());
		Jockey JockeyRussia = new Jockey(new CavaloMarrom(), new MedicoBritanico(),
				new CorredorRusso());
		
		// Exibindo as informa��es do corredor alem�o da equipe alem�
		System.out.println("Jockey Alem�o da equipe Alem�:");
		System.out.println("Nome: "+JockeyAlemanha.jockeys.nome());
		System.out.println("Sexo: "+JockeyAlemanha.jockeys.sexo());
		System.out.println("Peso: "+JockeyAlemanha.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyAlemanha.jockeys.altura()+"m");
		System.out.println("N�vel de Habilidade: "+JockeyAlemanha.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informa��es do m�dico americano da equipe alem�
		System.out.println("M�dico Americano da equipe Alem�:");
		System.out.println("Nome: "+JockeyAlemanha.medicos.nome());
		System.out.println("Sexo: "+JockeyAlemanha.medicos.sexo());
		System.out.println("N�vel de Habilidade: "+JockeyAlemanha.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
				
		// Exibindo os atributos do cavalo preto
		System.out.println("Cavalo Preto da equipe Alem�:");
		System.out.println("N�vel: "+JockeyAlemanha.cavalo.forca()+" de For�a");
		System.out.println("Acelera��o: "+JockeyAlemanha.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade M�xima: "+JockeyAlemanha.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("N�vel: "+JockeyAlemanha.cavalo.resistencia()+" de Resist�ncia");
		System.out.println("Idade: "+JockeyAlemanha.cavalo.idade()+" anos");
		System.out.println("Ra�a: "+JockeyAlemanha.cavalo.raca());
		
		// Separador
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		
		// Exibindo as informa��es do corredor brasileiro da equipe brasileira
		System.out.println("Jockey Brasileiro da equipe Brasileira:");
		System.out.println("Nome: "+JockeyBrasil.jockeys.nome());
		System.out.println("Sexo: "+JockeyBrasil.jockeys.sexo());
		System.out.println("Peso: "+JockeyBrasil.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyBrasil.jockeys.altura()+"m");
		System.out.println("N�vel de Habilidade: "+JockeyBrasil.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informa��es do m�dico britanico da equipe brasileira
		System.out.println("M�dico Brit�nico da equipe Brasileira:");
		System.out.println("Nome: "+JockeyBrasil.medicos.nome());
		System.out.println("Sexo: "+JockeyBrasil.medicos.sexo());
		System.out.println("N�vel de Habilidade: "+JockeyBrasil.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exibindo os atributos do cavalo branco
		System.out.println("Cavalo Branco da equipe Brasileira:");
		System.out.println("N�vel: "+JockeyBrasil.cavalo.forca()+" de For�a");
		System.out.println("Acelera��o: "+JockeyBrasil.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade M�xima: "+JockeyBrasil.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("N�vel: "+JockeyBrasil.cavalo.resistencia()+" de Resist�ncia");
		System.out.println("Idade: "+JockeyBrasil.cavalo.idade()+" anos");
		System.out.println("Ra�a: "+JockeyAlemanha.cavalo.raca());
				
		// Separador
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		
		// Exibindo as informa��es do corredor russo da equipe russa
		System.out.println("Jockey Russo da equipe Russa:");
		System.out.println("Nome: "+JockeyRussia.jockeys.nome());
		System.out.println("Sexo: "+JockeyRussia.jockeys.sexo());
		System.out.println("Peso: "+JockeyRussia.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyRussia.jockeys.altura()+"m");
		System.out.println("N�vel de Habilidade: "+JockeyRussia.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informa��es do m�dico polones da equipe russa
		System.out.println("M�dico Polon�s da equipe Russa:");
		System.out.println("Nome: "+JockeyRussia.medicos.nome());
		System.out.println("Sexo: "+JockeyRussia.medicos.sexo());
		System.out.println("N�vel de Habilidade: "+JockeyRussia.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
				
		// Exibindo os atributos do cavalo marrom
		System.out.println("Cavalo Marrom da equipe Russa:");
		System.out.println("N�vel: "+JockeyRussia.cavalo.forca()+" de For�a");
		System.out.println("Acelera��o: "+JockeyRussia.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade M�xima: "+JockeyRussia.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("N�vel: "+JockeyRussia.cavalo.resistencia()+" de Resist�ncia");
		System.out.println("Idade: "+JockeyRussia.cavalo.idade()+" anos");
		System.out.println("Ra�a: "+JockeyRussia.cavalo.raca());
	

	}

}
