package CorridaCavalos;

// Definindo os atributos que ser�o herdados pelos 3 cavalos do game
public interface ICavalos {
	public int forca(); // Valor de 0 � 10
	public int aceleracao(); // Valor de 0 � 20km/s
	public int velocidadeMaxima(); // Valor de 60km/s � 70km/s
	public int resistencia(); // Valor de 0 � 10
	public int idade(); // Valor de 8 � 15
	public String raca(); // Ser�o utilizadas 3 ra�as no total
}
