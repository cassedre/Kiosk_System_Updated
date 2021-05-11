package com.moviekioskicrm.domain.enums;

public enum Status  {
	RENTED (1, "Rented"),
	AVAILABLE(2, "Available");
	
	
	private int cod ;
	private String descricao;
		
		
	private Status (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
		
	}
	public int getCod() { //uma vez instanciado o enum, voce nao muda mais(constante). entao so precisamos do get
		return cod;
		
	}
	public String getDescricao() {
		return descricao;
		
	}
	public static Status toEnum(Integer cod) { //static porque sera possivel usar sem instanciar o objeto
		
		if(cod ==null) { //busca se o teste que for passado for nulo 
			
			return null;
		}
		for (Status x : Status.values()) { //todo objeto possivl pessoa fisica ou juridica, se ele for igual ao codigo que foi informado entao ele retorna o objeto pessoa fisica ou juridica, se nao existir ninguem ai eu dou um object invalid
			
			if (cod.equals(x.getCod())) {
				
				return x;
				
			}
		}
		throw new IllegalArgumentException("Id invalid" + cod);
	}}
