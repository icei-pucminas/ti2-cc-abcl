package dao;

import java.sql.*;

import model.Usuario;

public class DAOUsuarios {
	private static Connection conexao;
	
	public DAOUsuarios() {
		conexao = null;
	}
	
	public boolean close() {
		boolean status = false;
		
		try {
			conexao.close();
			status = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return status;
	}
	

	
	public static Usuario getUsuario(int codigo) { // LUIZA VOCE TEM Q DEIXAR ESSE TO USANDO ELE NA DAO DE PROCESSOS
		Usuario[] usuarios = null;
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM tablex WHERE codigo = " + codigo);		
	         if(rs.next()){
	             rs.last();
	             usuarios = new Usuario[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("nome"), 
	                		                  rs.getString("sobrenome"), rs.getString("senha"),rs.getString("email"), rs.getString("telefone"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return usuarios[0];
	}
}