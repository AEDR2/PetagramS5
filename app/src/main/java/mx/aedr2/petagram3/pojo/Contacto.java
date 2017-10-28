package mx.aedr2.petagram3.pojo;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import mx.aedr2.petagram3.ManejoCorreo;
import mx.aedr2.petagram3.R;

public class Contacto extends AppCompatActivity {
    Button bEnvio;
    EditText etNombre, etCorreo, etMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        //se establecen los edit text
        etNombre = (EditText) findViewById(R.id.etNombre);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etMensaje = (EditText) findViewById(R.id.etMensaje);

        bEnvio = (Button) findViewById(R.id.bEnvio);
        bEnvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString(), mensaje = etMensaje.getText().toString(), correo = etCorreo.getText().toString();
                if(nombre.equals("")||mensaje.equals("")||correo.equals("")){
                    Snackbar.make(view, "Faltan datos", Snackbar.LENGTH_LONG)
                            .show();
                }
                else {
                    //Si hay correo, mensaje y nombre
                    ManejoCorreo manejoCorreo = new ManejoCorreo(nombre, mensaje, correo);
                    if(manejoCorreo.enviarCorreo()){
                        Snackbar.make(view, "Correo enviado", Snackbar.LENGTH_LONG)
                                .show();
                    }
                    else{
                        Snackbar.make(view, "Error al enviar correo", Snackbar.LENGTH_LONG)
                                .show();
                    }
                }
            }
        });


    }

}
