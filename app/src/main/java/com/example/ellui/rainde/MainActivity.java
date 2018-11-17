package com.example.ellui.rainde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.AsyncTask;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private Button btSave;
    private EditText etName;
    private EditText etPosition;
    private EditText etAge;
    private EditText etTurn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etPosition = findViewById(R.id.etPosition);
        etTurn = findViewById(R.id.etTurn);
        etAge = findViewById(R.id.etAge);
        btSave=findViewById(R.id.btSave);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    new saveUser().execute();
            }
        });
    }

    class saveUser extends AsyncTask {
        SqlConn actualizar = new SqlConn();
        String naame = etName.getText().toString();
        String position= etPosition.getText().toString();
        String age = etAge.getText().toString();
        String turn = etTurn.getText().toString();

        String resultado = "";
        @Override

        protected String doInBackground(Object[] params) {

          /*  try {
                actualizar.Connect();
                int result = actualizar.Update("UPDATE paciente SET nombre='"+nom
                        +"', calle='"+cal+"', numero='"+num
                        +"', colonia='"+col+ "' where idpaciente="+ 1 );
                if(result > 0){
                    //new popup("Exito al insertar");
                    resultado = "Exito al actualizar";
                }else{
                    resultado = "Error al actualizar";
                }
                return resultado;
            }catch (Exception e){
                //new popup(e.toString());
                resultado = e.toString();
                return resultado;

            }
*/
          return "";
        }

        @Override
        protected void onPostExecute(Object result) {
                Intent docreg = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(docreg);
                finish();
            }
        }

}
