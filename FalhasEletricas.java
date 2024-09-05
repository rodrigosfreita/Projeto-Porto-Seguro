package model;


public class FalhasEletricas {

	private Veiculo veiculo;
	private boolean alternadores;
	private boolean correiaAlternador;
	private boolean fusiveis ;
	private boolean sistemaIgnicao;
	private boolean iluminacao;
	private boolean cabos;
	private boolean velas;
	private boolean bobina;

	
	public FalhasEletricas(Veiculo veiculo, boolean alternadores, boolean correiaAlternador,
			boolean fusiveis, boolean sistemaIgnicao, boolean iluminação, boolean cabos,
			boolean velas, boolean bobina) {	
		
		this.veiculo = veiculo;
		this.alternadores = alternadores;
		this.correiaAlternador = correiaAlternador;
		this.fusiveis = fusiveis;
		this.sistemaIgnicao = sistemaIgnicao;
		this.iluminacao = iluminação;
		this.cabos = cabos;
		this.velas = velas;
		this.bobina = bobina;
		
		
		System.out.println("Construtor cheio - objeto FalhasEletricas criado!");

	}
	
	public FalhasEletricas() {
		System.out.println("Construtor vazio - objeto FalhasEletricas criado!");
	};
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo (Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public boolean getAlternadores() {
		return alternadores;
	}
	
	public void setAlternadores(boolean alternadores) {	
		this.alternadores = alternadores;
	}
	
	public boolean getCorreiaAlternador() {
		return correiaAlternador;
	}
	
	public void setCorreiaAlternador(boolean correiaAlternador) {
		this.correiaAlternador = correiaAlternador;
	}
	
	public boolean getFusiveis() {
		return fusiveis;
	}
	
	public void setFusiveis(boolean fusiveis) {
		this.fusiveis = fusiveis;
	}
	
	public boolean getSistemaIgnicao() {
		return sistemaIgnicao;
	}
	
	public void setSistemaIgnicao(boolean sistemaIgnicao) {
		this.sistemaIgnicao = sistemaIgnicao;
	}
	
	public  boolean getiLuminacao() {
		return iluminacao;
	}
	
	public void setiLuminacao(boolean iluminacao) {
		this.iluminacao = iluminacao;
	}
	
	public boolean getCabos() {
		return cabos;
	}
	
	public void setCabos(boolean cabos) {
		this.cabos = cabos;
	}
	
	public boolean getVelas() {
		return velas;
	}
	
	public void setVelas(boolean velas) {
		this.velas = velas;
	}
	
	public boolean getBobina() {
		return bobina;
	}
	
	public void setBobina (boolean bobina) {
		this.bobina = bobina;
	}
	
	
	
	@Override
	public String toString (){
		return "FalhasEletricas[veiculo=" + veiculo + ",alternadores=" + alternadores + "correiaAlternador="+ 
				correiaAlternador +",fusiveis=" + fusiveis + ",sistemaIgnicao=" + sistemaIgnicao + ",iluminacao="
			+ "" + iluminacao + ",cabos=" + cabos +",velas=" + velas + 
			",bobina="+ bobina +"]";
	}
	

	
}
