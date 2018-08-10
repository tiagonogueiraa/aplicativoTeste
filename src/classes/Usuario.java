/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Tiago Nogueira
 */
public class Usuario {
    
    private String nome;
    private String matricula;
    private String senha;

    public Usuario(String nome, String matricula, String senha) {
        this.nome = "admin";
        this.matricula = "AC2018";
        this.senha = "s1234";
    }
    
    	private String verificaSenha(String senha){
		if(senha.length() == 5){
			return "Senha Inválida Para o Usuário: ";
		}
		return "Senha Aceita Para o Usuário: ";
	}
    
        
        private String verificaMatricula(String Matricula){
		if(senha.length() < 6){
			return "Matricula inválida para o Usuário: ";
		}
		return "Matricula Aceita Para o Usuário: ";
	}
        
        private String efetuaLogin(String matricula, String senha){
		if(matricula == this.matricula && senha == this.senha){
			return "login efetuado com sucesso";
		}
		return "Senha incorreta ";
	}
    
    
}
