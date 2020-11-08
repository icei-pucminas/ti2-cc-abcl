package dao;

import java.sql.*;

import model.Processo;
import model.Tarefa;

public class DAOTarefas {
    private static Connection conexao;
    //private String nomes_tarefas[] = 
    
    public DAOTarefas() {
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
			System.err.println("Conex�o N�O efetuada com o postgres -- Driver n�o encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conex�o N�O efetuada com o postgres -- " + e.getMessage());
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
	
	/*
    public boolean addTarefa(Tarefa tarefa) {
		boolean status = false;
		DAOTarefas dao = new DAOTarefas();
		dao.conectar();
	
		try {  
			Statement st = conexao.createStatement();
			
			Tarefa user = (Tarefa) dao.getTarefa(tarefa.getUser_id());
			if(user == null)
				return false;
			
			st.executeUpdate("INSERT INTO processo (ajuda, completo, user_id, codigo_processo, nome_processo) "
					       + "VALUES ("+ processo.isAjuda()+ ", '" + processo.isCompleto() + "', '" + processo.getUser_id() +
					       "', '" + processo.getCodigo_processo() + "', '" + nomes_processos[processo.getCodigo_processo()-1] + "');");
			st.close();
			status = true;
		} catch (SQLException u) {  
			status = false;
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
			int pr = processo.getCodigo_processo() + 1;
			Statement st = conexao.createStatement();
			String sql = "UPDATE processo SET codigo_processo = " + pr + ", nome_processo = '" + nomes_processos[pr-1] + "' WHERE user_id = " + processo.getUser_id();
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
	}*/

}
