package connection;

import javax.swing.JOptionPane;

/**
 *Realiza a consulta no site https://receitaws.com.br/
 *
 */
public final class ConsultaCNPJController {

    public PessoaJuridica consultaReceitaWS(String cnpj) throws Exception {
        ConsultaReceitaWS consultaReceitaWS = new ConsultaReceitaWS();
        return consultaReceitaWS.consulta(cnpj);
    }

    public PessoaJuridica consulta(String cnpj) {
        cnpj = cnpj.replaceAll("[^0123456789]", "");

        try {
            PessoaJuridica consultaPessoa = this.consultaReceitaWS(cnpj);
            if (consultaPessoa != null) {
                return consultaPessoa;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Problema", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
}
