package entities;

import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Luta() {
		
	}
	
	public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}


	private Lutador getDesafiado() {
		return desafiado;
	}


	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}


	private Lutador getDesafiante() {
		return desafiante;
	}


	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}


	private int getRounds() {
		return rounds;
	}


	private void setRounds(int rounds) {
		this.rounds = rounds;
	}


	private boolean isAprovada() {
		return aprovada;
	}


	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if( l1.getCategoria() == l2.getCategoria() ) {
			if(l1 != l2 ) {
				this.setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);
				System.out.println("Luta entre " + l1.getNome() + " e " + l2.getNome() + " marcada!");
			} else {
				System.out.println("Luta não pode acontecer!");
			}
		}else {
			System.out.println("Luta não pode acontecer!");
		}
	}
	
	public void lutar() {
		
		if( this.isAprovada() ) {
			
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			Random random = new Random();
			int vencedor = random.nextInt(3);
			switch(vencedor) {
				case 0 :
					System.out.println();
					System.out.println("Empate!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println();
					System.out.println("Vencedor: " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println();
					System.out.println("Vencedor: " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		}else {
			System.out.println("Luta não pode acontecer!");
		}
	}
}
