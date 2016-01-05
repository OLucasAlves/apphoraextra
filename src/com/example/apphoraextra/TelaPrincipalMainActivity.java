package com.example.apphoraextra;

import java.math.BigDecimal;
import java.util.Locale;

import com.example.helper.FuncionarioHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TelaPrincipalMainActivity extends Activity {

	private Button btConfirmar;
	private EditText edtSalario;
	private EditText edtHoraTrab;
	private double novoSalario;
	private double salario;
	private double hora;
	private RadioButton r50; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_principal_main);
		
		edtSalario = (EditText) findViewById(R.id.edtSalario);
		edtHoraTrab = (EditText)findViewById(R.id.edtHoraTrab);
		btConfirmar = (Button) findViewById(R.id.btConfirmar);
		RadioGroup rg = (RadioGroup) findViewById(R.id.radioOpcao);
		r50 = (RadioButton) findViewById(R.id.radio50);
		btConfirmar = (Button) findViewById(R.id.btConfirmar);
		
		btConfirmar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				calcular();
				Toast.makeText(TelaPrincipalMainActivity.this,"Seu salario é " +novoSalario, Toast.LENGTH_LONG).show();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_principal_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public double calcular(){
		salario = Double.parseDouble(edtSalario.getText().toString());
		hora = Double.parseDouble(edtHoraTrab.getText().toString());
		
		if(r50.isChecked()){
			novoSalario = salario + ((salario / 220) * 0.50) * hora;
			novoSalario = Double.valueOf(String.format(Locale.US, "%.2f", novoSalario));
		}else{
			novoSalario = salario + ((salario / 220) * 1) * hora;
			novoSalario = Double.valueOf(String.format(Locale.US, "%.2f", novoSalario));
		}
		
		return novoSalario;
		
	}

}
