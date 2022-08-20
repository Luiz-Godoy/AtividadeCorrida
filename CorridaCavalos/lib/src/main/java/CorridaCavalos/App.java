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
		
		// Exibindo as informações do corredor alemão da equipe alemã
		System.out.println("Jockey Alemão da equipe Alemã:");
		System.out.println("Nome: "+JockeyAlemanha.jockeys.nome());
		System.out.println("Sexo: "+JockeyAlemanha.jockeys.sexo());
		System.out.println("Peso: "+JockeyAlemanha.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyAlemanha.jockeys.altura()+"m");
		System.out.println("Nível de Habilidade: "+JockeyAlemanha.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informações do médico americano da equipe alemã
		System.out.println("Médico Americano da equipe Alemã:");
		System.out.println("Nome: "+JockeyAlemanha.medicos.nome());
		System.out.println("Sexo: "+JockeyAlemanha.medicos.sexo());
		System.out.println("Nível de Habilidade: "+JockeyAlemanha.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
				
		// Exibindo os atributos do cavalo preto
		System.out.println("Cavalo Preto da equipe Alemã:");
		System.out.println("Nível: "+JockeyAlemanha.cavalo.forca()+" de Força");
		System.out.println("Aceleração: "+JockeyAlemanha.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade Máxima: "+JockeyAlemanha.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("Nível: "+JockeyAlemanha.cavalo.resistencia()+" de Resistência");
		System.out.println("Idade: "+JockeyAlemanha.cavalo.idade()+" anos");
		System.out.println("Raça: "+JockeyAlemanha.cavalo.raca());
		
		// Separador
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		
		// Exibindo as informações do corredor brasileiro da equipe brasileira
		System.out.println("Jockey Brasileiro da equipe Brasileira:");
		System.out.println("Nome: "+JockeyBrasil.jockeys.nome());
		System.out.println("Sexo: "+JockeyBrasil.jockeys.sexo());
		System.out.println("Peso: "+JockeyBrasil.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyBrasil.jockeys.altura()+"m");
		System.out.println("Nível de Habilidade: "+JockeyBrasil.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informações do médico britanico da equipe brasileira
		System.out.println("Médico Britânico da equipe Brasileira:");
		System.out.println("Nome: "+JockeyBrasil.medicos.nome());
		System.out.println("Sexo: "+JockeyBrasil.medicos.sexo());
		System.out.println("Nível de Habilidade: "+JockeyBrasil.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exibindo os atributos do cavalo branco
		System.out.println("Cavalo Branco da equipe Brasileira:");
		System.out.println("Nível: "+JockeyBrasil.cavalo.forca()+" de Força");
		System.out.println("Aceleração: "+JockeyBrasil.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade Máxima: "+JockeyBrasil.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("Nível: "+JockeyBrasil.cavalo.resistencia()+" de Resistência");
		System.out.println("Idade: "+JockeyBrasil.cavalo.idade()+" anos");
		System.out.println("Raça: "+JockeyAlemanha.cavalo.raca());
				
		// Separador
		System.out.println();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println();
		
		// Exibindo as informações do corredor russo da equipe russa
		System.out.println("Jockey Russo da equipe Russa:");
		System.out.println("Nome: "+JockeyRussia.jockeys.nome());
		System.out.println("Sexo: "+JockeyRussia.jockeys.sexo());
		System.out.println("Peso: "+JockeyRussia.jockeys.peso()+"kg");
		System.out.println("Altura: "+JockeyRussia.jockeys.altura()+"m");
		System.out.println("Nível de Habilidade: "+JockeyRussia.jockeys.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
		
		// Exbidindo as informações do médico polones da equipe russa
		System.out.println("Médico Polonês da equipe Russa:");
		System.out.println("Nome: "+JockeyRussia.medicos.nome());
		System.out.println("Sexo: "+JockeyRussia.medicos.sexo());
		System.out.println("Nível de Habilidade: "+JockeyRussia.medicos.NivelHabilidade());
		
		// Separador
		System.out.println();
		System.out.println();
				
		// Exibindo os atributos do cavalo marrom
		System.out.println("Cavalo Marrom da equipe Russa:");
		System.out.println("Nível: "+JockeyRussia.cavalo.forca()+" de Força");
		System.out.println("Aceleração: "+JockeyRussia.cavalo.aceleracao()+"km/s");
		System.out.println("Velocidade Máxima: "+JockeyRussia.cavalo.velocidadeMaxima()+"km/s");
		System.out.println("Nível: "+JockeyRussia.cavalo.resistencia()+" de Resistência");
		System.out.println("Idade: "+JockeyRussia.cavalo.idade()+" anos");
		System.out.println("Raça: "+JockeyRussia.cavalo.raca());
	

	}

}
