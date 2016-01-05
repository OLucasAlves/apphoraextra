package com.example.helper;

import com.example.apphoraextra.R;
import com.example.modelo.bean.Funcionario;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FuncionarioHelper{
	
	private EditText edtSalario;
	private EditText edtHoraTrab;
	private RadioButton r50; 
	private Funcionario funcionario;
	
	public FuncionarioHelper(Activity activity){
		edtSalario = (EditText) activity.findViewById(R.id.edtSalario);
		edtHoraTrab = (EditText) activity.findViewById(R.id.edtHoraTrab);
		r50 = (RadioButton) activity.findViewById(R.id.radio50);
		
		Funcionario funcionario = new Funcionario();
	}
}
