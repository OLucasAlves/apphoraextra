package com.example.controle;

import com.example.apphoraextra.R;
import com.example.modelo.bean.Funcionario;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FuncionarioControle{
	
	private EditText edtSalario;
	private EditText edtHoraTrab;
	private Button btConfirmar;
	private double novoSalario;
	private double salario;
	private double hora;
	private RadioButton r50; 
	
	
	public FuncionarioControle(Activity activity){
		edtSalario = (EditText) activity.findViewById(R.id.edtSalario);
		edtHoraTrab = (EditText) activity.findViewById(R.id.edtHoraTrab);
		btConfirmar = (Button) activity.findViewById(R.id.btConfirmar);
		RadioGroup rg = (RadioGroup) activity.findViewById(R.id.radioOpcao);
		r50 = (RadioButton) activity.findViewById(R.id.radio50);
	}
	
	public FuncionarioControle() {
		
	}

	public double calcular(){
		salario = Double.parseDouble(edtSalario.getText().toString());
		hora = Double.parseDouble(edtHoraTrab.getText().toString());
		
		
		if(r50.isChecked()){
			novoSalario = ((salario / 220) * 0.50) * hora; 
		}else{
			novoSalario = ((salario / 220) * 1) * hora;
		}
		return novoSalario;
	}

	
}
