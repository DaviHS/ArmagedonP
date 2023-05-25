package connection;

    /**
    *Determina informações a serem coletadas no dominio
    *
    */
public class PessoaJuridica {

    
	
	// Dados da pessoa.
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String enderecoEletronico;
	private String telefone;
	
	// Dados do Endereco da pessoa.
	private String rua;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
	private String situacao;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEnderecoEletronico() {
		return enderecoEletronico;
	}

	public void setEnderecoEletronico(String enderecoEletronico) {
		this.enderecoEletronico = enderecoEletronico;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/** 
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
		  .append(this.getCnpj())
		 
		  .append(this.getRazaoSocial())
		 		 
		  .append(this.getNomeFantasia())

		  .append(this.getRua())

		  .append(this.getNumero())
	
		  .append(this.getComplemento())

		  .append(this.getCep())
		
		  .append(this.getBairro())
		
		  .append(this.getMunicipio())

		  .append(this.getEstado())

		  .append(this.getEnderecoEletronico())

		  .append(this.getTelefone())
		  ;
		
		return sb.toString();
	}
	
}
