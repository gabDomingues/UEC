package entities;

public class Lutador {

	// atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, empates, derrotas;

	// construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates,
			int derrotas) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
		
	}

	// metodos especiais
	public void apresentar() {
		System.out.println("------------------------");
		System.out.println("APRSENTANDO " + this.getNome());
		System.out.println("ORIGEM: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " ANOS");
		System.out.println("PESANDO " + this.getPeso() + " KG");
		System.out.println("GANHOU " + this.getVitorias());
		System.out.println("PERDEU " + this.getDerrotas());
		System.out.println("EMPATOU " + this.getEmpates());
	}

	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria() + " com " + this.getVitorias() + 
				" vitórias " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// metodos 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

}
