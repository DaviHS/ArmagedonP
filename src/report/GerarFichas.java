/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class GerarFichas {
    private String relatorio;
    private String tipo;
    private String arg;
    private Connection con = null;
    
    public void fichas(String relatorio, String tipo, String arg) throws JRException, Exception {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        con = connectionFactory.getConnection();
        
        PreparedStatement pstmt = con.prepareStatement(
      
         "(SELECT  * from db_cadastro.clientes " 
                + "where "+ argumento +")");
        
        ResultSet rs = pstmt.executeQuery();
        
        JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
        
        Map parameters = new HashMap();
        
        
        JasperPrint jp = JasperFillManager.fillReport(relatorio, parameters, jrRS);
        
        JasperViewer.viewReport(jp, false);
        
    }
}
   
