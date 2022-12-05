package tenis_adri;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TenisDAO {

    public void inserir(Tenis tenis){
        String sql = "INSERT INTO tenis (nome, marca, tamanho, preco) VALUES (?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, tenis.getNome());
            pstm.setString(2, tenis.getMarca());
            pstm.setString(3, tenis.getTamanho());
            pstm.setFloat(4, tenis.getPreco());

            pstm.execute();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (pstm!=null){
                    pstm.close();
                }

                if (conn != null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
