package com.example.controle;

import com.example.modelo.bean.Funcionario;

public class FuncionarioControle {
	private double novoSalario;
	Funcionario f= new Funcionario(2.200,8,0.50);
	
	public double CalculaHoraExtra(){
		novoSalario = ((f.getSalario()/220) * f.getHorastrab()) + f.getTipo();
		return novoSalario;
	}
}
