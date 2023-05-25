/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 * Gera Ficha Cadastral para impressao
 * @author user
 */
public class GerarFichaCadastral {
    private String relatorio;
    private String cli;
    private String tra1;
    private String tra2;
    private Connection con = null;
    
    public void ficha(String relatorio, String arg) throws JRException, Exception {
        this.relatorio = relatorio;
        this.cli = relatorio;
        
        con = connectionFactory.getConnection();
        
        Statement stm = con.createStatement();
        String query;
        
        query = "(SELECT  * from db_cadastro.clientes, transportadora " 
                + "where id_clientes='"+ arg +"')";
        
        ResultSet rs = stm.executeQuery(query);
        
        JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
        
        Map parameters = new HashMap();
        
        
        JasperPrint jp = JasperFillManager.fillReport(relatorio, parameters, jrRS);
        
        JasperViewer.viewReport(jp, false);
        
    }
}