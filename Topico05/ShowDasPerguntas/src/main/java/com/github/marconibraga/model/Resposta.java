package com.github.marconibraga.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Resposta implements Serializable {

	private static final long serialVersionUID = -2354963041325466496L;
	
	private Pergunta pergunta;
	private String alternativa;
	private boolean correta;
	
	/**
	 * @param alternativa
	 * @param correta
	 */
	public Resposta(String alternativa, boolean correta) {
		super();
		this.alternativa = alternativa;
		this.correta = correta;
	}
	
	

}
