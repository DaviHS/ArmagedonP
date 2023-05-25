package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;


/**
 * Classe responsavel por consultar um CNPJ no dominio receitaws
 */
public class ConsultaReceitaWS implements ConsultaReceita {

	@Override
	public PessoaJuridica consulta(String cnpj) throws IOException {
		if (cnpj == null) {
			return null;
		}
		URL url = new URL("http://www.receitaws.com.br/v1/cnpj/" + cnpj);
		
		URLConnection openConnection = url.openConnection();
		if (openConnection == null) {
			throw new IOException("Não foi possivel conectar com o servidor de consulta de CNPJ receitaws");
		}
		InputStream is = openConnection.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		Gson gson = new Gson();
		
		//Transforma o resultado vindo em um objeto
		ReceitaWSCNPJ obj = gson.fromJson(reader, ReceitaWSCNPJ.class);
		PessoaJuridica pessoa = new PessoaJuridica();
		pessoa.setBairro(obj.getBairro());
		pessoa.setCep(obj.getCep());
		pessoa.setCnpj(obj.getCnpj());
		pessoa.setComplemento(obj.getComplemento());
		pessoa.setEstado(obj.getUf());
		pessoa.setMunicipio(obj.getMunicipio());
		pessoa.setNomeFantasia(obj.getFantasia());
		pessoa.setNumero(obj.getNumero());
		pessoa.setRazaoSocial(obj.getNome());
		pessoa.setRua(obj.getLogradouro());
		pessoa.setEnderecoEletronico(obj.getEmail());
		pessoa.setTelefone(obj.getTelefone());
		pessoa.setSituacao(obj.getSituacao());
		
		return pessoa;
	}
}