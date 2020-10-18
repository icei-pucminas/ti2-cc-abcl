package dao;

import java.sql.*;

import model.Processo;
import model.Usuario;

public class DAOProcessos {
	private static Connection conexao;
	
	public DAOProcessos() {
		conexao = null;
	}
	
	public boolean conectar() {
		String driverName = "org.postgresql.Driver";                    
		String serverName = "abcl-adota.postgres.database.azure.com";
		String mydatabase = "ABCLdb";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta +"/" + mydatabase;
		String username = "abcl_Adm@abcl-adota";
		String password = "adota@ti22020";
		boolean status = false;

		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao == null);
			System.out.println("Conexão efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
			System.err.println("Conexão NÃO efetuada com o postgres -- Driver não encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conexão NÃO efetuada com o postgres -- " + e.getMessage());
		}

		return status;
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
	
	public boolean addProcesso(Processo processo) {
		boolean status = false;
		DAOUsuarios dao = new DAOUsuarios();
		dao.conectar();
		try {  
			Statement st = conexao.createStatement();
			
			Usuario user = (Usuario) dao.getUsuario(processo.getUser_id());
			if(user == null)
				return false;
			
			st.executeUpdate("INSERT INTO processo (ajuda, completo, user_id, codigo_processo, nome_processo) "
					       + "VALUES ("+ processo.isAjuda()+ ", '" + processo.isCompleto() + "', '" + processo.getUser_id() +
					       "', '" + processo.getCodigo_processo() + "', '" + processo.getNome() + "');");
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public static boolean excluirProcesso(int codigo, int id) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM processo WHERE codigo_processo != " + codigo + " AND user_id = " + id);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean atualizarStatusProcesso(Processo processo) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			String sql = "UPDATE processo SET completo = " + true + " WHERE codigo_processo = " + processo.getCodigo_processo();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public static Processo getProcesso(int processo, int id) {
		Processo[] processos = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM processo WHERE user_id = " + id + "AND codigo_processo = " + processo);		
	         if(rs.next()){
	             rs.last();
	             processos = new Processo[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	            	 processos[i] = new Processo(rs.getBoolean("ajuda"), rs.getBoolean("completo"),
	                		                  rs.getInt("user_id"), rs.getInt("codigo_processo"), rs.getString("nome_processo"));
	             }
	          }
	          st.close();
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return processos[0];
	}
	
	public static Processo getProcesso(int id) {
		Processo[] processos = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM processo WHERE user_id = " + id);		
	         if(rs.next()){
	             rs.last();
	             processos = new Processo[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	            	 processos[i] = new Processo(rs.getBoolean("ajuda"), rs.getBoolean("completo"),
	                		                  rs.getInt("user_id"), rs.getInt("codigo_processo"), rs.getString("nome_processo"));
	             }
	          }
	          st.close();
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return processos[0];
	}
	
	public static Processo[] getProcessos(Usuario usuario) {
		Processo[] processos = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM processo WHERE user_id = " + usuario.getId() + "AND completo = " + false);		
	         if(rs.next()){
	             rs.last();
	             processos = new Processo[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	            	 processos[i] = new Processo(rs.getBoolean("ajuda"), rs.getBoolean("completo"),
	                		                  rs.getInt("user_id"), rs.getInt("codigo_processo"), rs.getString("nome_processo"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return processos;
	}

}
