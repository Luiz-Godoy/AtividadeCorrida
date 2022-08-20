package CorridaCavalos;

// Definindo os atributos que serão herdados pelos 3 cavalos do game
public interface ICavalos {
	public int forca(); // Valor de 0 à 10
	public int aceleracao(); // Valor de 0 à 20km/s
	public int velocidadeMaxima(); // Valor de 60km/s à 70km/s
	public int resistencia(); // Valor de 0 à 10
	public int idade(); // Valor de 8 à 15
	public String raca(); // Serão utilizadas 3 raças no total
}
