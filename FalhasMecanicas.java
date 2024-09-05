package model;

public class FalhasMecanicas {
	

		private Veiculo veiculos;
		private boolean superAquecimento;
		private boolean ingnicao;
		private boolean barulhosRuidos ;
		private boolean aumentoCombustivel;
		private boolean fumacaPreta;
		private boolean perdaPotencia;
		private boolean reservatorioAgua;
		private boolean aumentoTemperatura;
		
		
		public FalhasMecanicas(Veiculo veiculos, boolean superAquecimento, boolean ingnicao, boolean barulhosRuidos,
				boolean aumentoCombustivel, boolean fumacaPreta, boolean perdaPotencia, boolean reservatorioAgua,
				boolean aumentoTemperatura) {	
			
			this.veiculos = veiculos;
			this.superAquecimento = superAquecimento;
			this.ingnicao = ingnicao;
			this.barulhosRuidos = barulhosRuidos;
			this.aumentoCombustivel = aumentoCombustivel;
			this.fumacaPreta = fumacaPreta;
			this.perdaPotencia = perdaPotencia;
			this.reservatorioAgua = reservatorioAgua;
			this.aumentoTemperatura = aumentoTemperatura;
			
			System.out.println("Construtor cheio - objeto Veiculo criado!");

		}
		
		public FalhasMecanicas() {
			System.out.println("Construtor vazio - objeto Veiculo criado!");
		};
		
		public Veiculo getVeiculos() {
			return veiculos;
		}
		
		public void setVeiculos (Veiculo veiculos) {
			this.veiculos = veiculos;
		}
		
		public boolean getSuperAquecimento() {
			return superAquecimento;
		}
		
		public void setSuperAquecimento(boolean superAquecimento) {	
			this.superAquecimento = superAquecimento;
		}
		
		public boolean getIngnicao() {
			return ingnicao;
		}
		
		public void setIngnicao(boolean ingnicao) {
			this.ingnicao = ingnicao;
		}
		
		public boolean getBarulhosRuidos() {
			return barulhosRuidos;
		}
		
		public void setBarulhosRuidos(boolean barulhosRuidos) {
			this.barulhosRuidos = barulhosRuidos;
		}
		
		public boolean getAumentoCombustivel() {
			return aumentoCombustivel;
		}
		
		public void setAumentoCombustivel(boolean aumentoCombustivel) {
			this.aumentoCombustivel = aumentoCombustivel;
		}
		
		public  boolean getFumacaPreta() {
			return fumacaPreta;
		}
		
		public void setFumacaPreta(boolean fumacaPreta) {
			this.fumacaPreta = fumacaPreta;
		}
		
		public boolean getPerdaPotencia() {
			return perdaPotencia;
		}
		
		public void setPerdaPotencia(boolean perdaPotencia) {
			this.perdaPotencia = perdaPotencia;
		}
		
		public boolean getReservatorioAgua() {
			return reservatorioAgua;
		}
		
		public void setReservatorioAgua(boolean reservatorioAgua) {
			this.reservatorioAgua = reservatorioAgua;
		}
		
		public boolean getAumentoTemperatura() {
			return aumentoTemperatura;
		}
		
		public void setAumentoTemperatura (boolean aumentoTemperatura) {
			this.aumentoTemperatura = aumentoTemperatura;
		}
		
		@Override
		public String toString (){
			return "FalhasMecanicas[veiculos=" + veiculos + ",superAquecimento=" + superAquecimento + ",ingnicao="+ 
					ingnicao +",barulhosRuidos=" + barulhosRuidos + ",aumentoCombustivel=" + aumentoCombustivel + ",fumacaPreta="
				+ "" + fumacaPreta + ",perdaPotencia=" + perdaPotencia +",reservatorioAgua=" + reservatorioAgua + 
				",aumentoTemperatura="+ aumentoTemperatura +"]";
		}
		


}
