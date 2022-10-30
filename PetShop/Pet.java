package PetShop;

public class Pet {
	private Cliente cliente = new Cliente();
	private String nomePet,
	especiePet,
	racaPet,
	corPet;
	private int idadePet;
	private int codigoPet;
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	public Pet(String nomePet, String especiePet, String racaPet, String corPet, int idadePet, int codigoPet) {
		super();
		this.nomePet = nomePet;
		this.especiePet = especiePet;
		this.racaPet = racaPet;
		this.corPet = corPet;
		this.idadePet = idadePet;
		this.codigoPet = codigoPet;
	}

	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public String getEspeciePet() {
		return especiePet;
	}
	public void setEspeciePet(String especiePet) {
		this.especiePet = especiePet;
	}
	public String getRacaPet() {
		return racaPet;
	}
	public void setRacaPet(String racaPet) {
		this.racaPet = racaPet;
	}
	public String getCorPet() {
		return corPet;
	}
	public void setCorPet(String corPet) {
		this.corPet = corPet;
	}
	public int getIdadePet() {
		return idadePet;
	}
	public void setIdadePet(int idadePet) {
		this.idadePet = idadePet;
	}

	public int getCodigoPet() {
		return cliente.getCodigoCliente();
	}

	

}
