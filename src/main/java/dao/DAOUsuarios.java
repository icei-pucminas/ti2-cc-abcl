package dao;

import java.sql.*;
import model.Usuario;
import model.Processo;
		

public class DAOUsuarios {
	private static Connection conexao;
	
	public DAOUsuarios() {
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
			System.out.println("Conex�o efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
//			System.err.println("Conex�o N�O efetuada com o postgres -- Driver n�o encontrado -- " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
//			System.err.println("Conex�o N�O efetuada com o postgres -- " + e.getMessage());
			e.printStackTrace();
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
	
	public boolean addUsuarios (Usuario user){
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO usuario "
					       + "VALUES ( '"+ user.getNome()+ "', '" + user.getSobrenome() + "', '" + user.getTelefone()+"', '" + user.getEmail() +"', '" + user.getSenha()+  "');");
			st.close();
			status = true;
		} catch (SQLException u) {  
			status = false;
		}
		return status;
		
	}
	
	public boolean atualizarStatusProcesso(Usuario user) {
		boolean status = false;
		try {  
			int pr = user.getProcesso_ativo() + 1;
			user.setProcesso_ativo(pr);
			Statement st = conexao.createStatement();
			String sql = "UPDATE usuario SET processo_ativo = " + pr  + " WHERE id = " + user.getId();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public static Usuario[] getUsuarios() {
		Usuario[] user = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM usuario");		
	         if(rs.next()){
	             rs.last();
	             user = new Usuario[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                user[i] = new Usuario(rs.getString("nome"),rs.getString("sobrenome"),  rs.getString("telefone"), rs.getString("email"), rs.getString("senha"), rs.getInt("processo_ativo"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return user;		
	}


	
	public static Usuario getUsuario(int id) { // LUIZA VOCE TEM Q DEIXAR ESSE TO USANDO ELE NA DAO DE PROCESSOS
		Usuario[] usuarios = new Usuario[1];
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE id = " + id);		
	         if(rs.next()){
	             rs.last();
	             usuarios = new Usuario[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("nome"), 
	                		                  rs.getString("sobrenome"), rs.getString("senha"),rs.getString("email"), rs.getString("telefone"), rs.getInt("processo_ativo"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return usuarios[0];
	}
	
	public static Usuario getUsuario(String email) { // LUIZA VOCE TEM Q DEIXAR ESSE TO USANDO ELE NA DAO DE PROCESSOS
		Usuario[] usuarios = new Usuario[1];
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE email = '" + email + "'");		
	         if(rs.next()){
	             rs.last();
	             usuarios = new Usuario[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("nome"), 
	                		                  rs.getString("sobrenome"), rs.getString("senha"),rs.getString("email"), rs.getString("telefone"), rs.getInt("processo_ativo"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return usuarios[0];
	}
	
	
	public boolean atualizarUsuario(Usuario user) {
		System.out.println("aquiiiiiiiiii");
		boolean status = false;
		try {  
			int pr = user.getProcesso_ativo() + 1;
			user.setProcesso_ativo(pr);
			Statement st = conexao.createStatement();
			String sql = "UPDATE usuario SET processo_ativo = " + pr + " WHERE id = " + user.getId();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public static Usuario loginUsuario(String email, String senha) { // LUIZA VOCE TEM Q DEIXAR ESSE TO USANDO ELE NA DAO DE PROCESSOS
		Usuario[] usuarios = new Usuario[1];
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE email = '" + email + "' AND senha = '" + senha + "'");		
	         if(rs.next()){
	             rs.last();
	             usuarios = new Usuario[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("nome"), 
	                		                  rs.getString("sobrenome"), rs.getString("senha"),rs.getString("email"), rs.getString("telefone"), rs.getInt("processo_ativo"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return usuarios[0];
	}
}