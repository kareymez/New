package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.anew.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void EnviarMensaje(View view) {
        Intent enviar = new Intent(this, MainActivity2.class);
        final TextView etSaludo = findViewById(R.id.etSaludo);
        String mensaje = etSaludo.getText().toString();
        enviar.putExtra(EXTRA_MESSAGE, mensaje);
        startActivity(enviar);
    }
    public void Llamar (View view){
        Intent llamar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 2261035501"));
        startActivity(llamar);
    }

    public void IniciarWhatsApp (View view){
        Intent iniciarWhatsApp = getPackageManager().getLaunchIntentForPackage( "com.whatsapp");
        startActivity(iniciarWhatsApp);
    }

    public void imagen (View view){
        Intent imagen = getPackageManager().getLaunchIntentForPackage( "com.whatsapp");
        startActivity(imagen);
    }
    public void Facebook (View view){
        Uri uri = Uri.parse("https://www.facebook.com/cerquitadepuebla");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        try{
            startActivity(intent);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            finish();
        }

    }

    public void Messenger (View view){
        Uri uri = Uri.parse("https://www.messenger.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        try{
            startActivity(intent);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            finish();
        }

    }
    public void Instagram (View view){
        Uri uri = Uri.parse("https://instagram.com/cerquitadepuebla?igshid=1k33gygxeen8e");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        try{
            startActivity(intent);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            finish();
        }

    }
    public void Twitter (View view){
        Uri uri = Uri.parse("https://twitter.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        try{
            startActivity(intent);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            finish();
        }

    }

    }

