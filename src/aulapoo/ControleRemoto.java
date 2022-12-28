package aulapoo;

public class ControleRemoto implements Controlador {

	//Atributos
	private int volume;
	private boolean tocando;
	private boolean ligado;
	
	//Método Construtor
	public ControleRemoto() {
		this.volume = 50;
		this.tocando = false;
		this.ligado = false;
	}
	//Métodos Getters e Setters
	private int getVolume() {
		return this.volume;
	}
	private boolean getTocando() {
		return this.tocando;
	}
	private boolean getLigado() {
		return this.ligado;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	//Métodos abstratos
	
	@Override
	public void ligar() {
	this.setLigado(true);
	}

	@Override
	public void desligar() {
	this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligada? " + this.getLigado());
		System.out.println("Tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0;i<=this.getVolume();i+=10) {
			System.out.print("|");
		}	
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Elegantissimo User, primeiro deves ligar.");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Elegantissimo User, primeiro deves ligar.");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
		
	
}
