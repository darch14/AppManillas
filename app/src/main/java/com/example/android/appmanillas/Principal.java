package com.example.android.appmanillas;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {

    private Intent i;
    private Bundle b;
    private EditText cajaCantidad;
    private Spinner comboMaterial;
    private Spinner comboDije;
    private Spinner comboTipo;
    private Resources res;
    private RadioButton r1,r2;
    private ArrayAdapter<String> adapter1, adapter2, adapter3;
    private String[] opc1, opc2, opc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad = (EditText) findViewById(R.id.txtCantidad);
        comboMaterial = (Spinner)findViewById(R.id.cmdMaterial);
        comboDije = (Spinner)findViewById(R.id.cmdDije);
        comboTipo = (Spinner)findViewById(R.id.cmdTipo);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        i = new Intent(this,Recibo.class);
        b = new Bundle();
        res = this.getResources();
        opc1 = this.res.getStringArray(R.array.material);
        opc2 = this.res.getStringArray(R.array.dije);
        opc3 = this.res.getStringArray(R.array.tipo);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc1);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc2);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc3);

        comboMaterial.setAdapter(adapter1);
        comboDije.setAdapter(adapter2);
        comboTipo.setAdapter(adapter3);
    }

    public void recibo(View v){

    }

    public int calcular(){
        int pres, cant;
        cant = Integer.parseInt(cajaCantidad.getText().toString());
        if (r1.isChecked()){
            if (comboMaterial.getSelectedItem()==0){
                if (comboDije.getSelectedItem()==0){
                    if (comboTipo.getSelectedItem()==0){
                            pres = cant*3000*100;
                    }else {
                        if (comboTipo.getSelectedItem()==1){
                            pres = cant*3000*100;
                        }else {
                            if (comboTipo.getSelectedItem()==2){
                                pres = cant*3000*80;
                            }else {
                                if (comboTipo.getSelectedItem()==3){
                                    pres = cant*3000*70;
                                }
                            }
                        }
                    }
                }else {
                    if (comboDije.getSelectedItem()==1){
                        if (comboTipo.getSelectedItem()==0){
                            pres=cant*3000*120;
                        }else {
                            if (comboTipo.getSelectedItem()==1){
                                pres=cant*3000*120;
                            }else {
                                if (comboTipo.getSelectedItem()==2){
                                    pres = cant*3000*100;
                                }else {
                                    if (comboTipo.getSelectedItem()==3){
                                        pres = cant*3000*90;
                                    }
                                }
                            }
                        }
                    }
                }
            }else {
                if (comboMaterial.getSelectedItem()==1){
                    if (comboDije.getSelectedItem()==0){
                        if (comboTipo.getSelectedItem()==0){
                            pres = cant*3000*90;
                        }else {
                            if (comboTipo.getSelectedItem()==1){
                                pres = cant*3000*90;
                            }else {
                                if (comboTipo.getSelectedItem()==2){
                                    pres = cant*3000*70;
                                }else {
                                    if (comboTipo.getSelectedItem()==3){
                                        pres = cant*3000*50;
                                    }
                                }
                            }
                        }
                    }else {
                        if (comboDije.getSelectedItem()==1) {
                            if (comboTipo.getSelectedItem()==0){
                                pres = cant*3000*110;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant*3000*110;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres = cant*3000*90;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                            pres = cant*3000*80;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else {
            if (r2.isChecked()){
                if (comboMaterial.getSelectedItem()==0){
                    if (comboDije.getSelectedItem()==0){
                        if (comboTipo.getSelectedItem()==0){
                            pres = cant*100;
                        }else {
                            if (comboTipo.getSelectedItem()==1){
                                pres = cant*100;
                            }else {
                                if (comboTipo.getSelectedItem()==2){
                                    pres = cant*80;
                                }else {
                                    if (comboTipo.getSelectedItem()==3){
                                        pres = cant*70;
                                    }
                                }
                            }
                        }
                    }else {
                        if (comboDije.getSelectedItem()==1){
                            if (comboTipo.getSelectedItem()==0){
                                pres = cant*120;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant*120;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres = cant*100;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                            pres = cant*90;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }else {
                    if (comboMaterial.getSelectedItem()==1){
                        if (comboDije.getSelectedItem()==0){
                            if (comboTipo.getSelectedItem()==0){
                                pres = cant*90;
                            }else {
                                if (comboTipo.getSelectedItem()==1){
                                    pres = cant*90;
                                }else {
                                    if (comboTipo.getSelectedItem()==2){
                                        pres = cant*70;
                                    }else {
                                        if (comboTipo.getSelectedItem()==3){
                                            pres = cant*50;
                                        }
                                    }
                                }
                            }
                        }else {
                            if (comboDije.getSelectedItem()==1){
                                if (comboTipo.getSelectedItem()==0){
                                    pres = cant*110;
                                }else {
                                    if (comboTipo.getSelectedItem()==1){
                                        pres = cant*110;
                                    }else {
                                        if (comboTipo.getSelectedItem()==2){
                                            pres = cant*90;
                                        }else {
                                            if (comboTipo.getSelectedItem()==3){
                                                pres = cant*80;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return pres;
    }

    public boolean validar(){
        if (cajaCantidad.getText().toString().isEmpty()){
            cajaCantidad.setError(res.getString(R.string.error1));
            return false;
        }
        return true;
    }
}
