package com.sandoval.jeison.vocablov01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PantallaInicio extends AppCompatActivity implements View.OnClickListener{

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicio);

        boton = (Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent intent = new Intent(this,MainActivity.class);
                finish();
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
