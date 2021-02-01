package com.javacodegeeks.examples.main;

import android.app.Activity; import android.os.Bundle; import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity { private Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button = (Button) findViewById(R.id.mainbutton);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) { Toast.makeText(getApplicationContext(),"Message Bouton 1", Toast.LENGTH_LONG).show();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) { Toast.makeText(getApplicationContext(),"Message Toast", Toast.LENGTH_LONG).show();
            }
        });
        final TextView textView=(TextView)findViewById(R.id.text1);
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("exercice 4");


            }
        });
        button = (Button) findViewById(R.id.button4);
       button.setOnLongClickListener(new View.OnLongClickListener(){
           @Override
           public boolean onLongClick(View v){
               Toast.makeText(getApplicationContext(),"Long click",Toast.LENGTH_LONG).show();
               return true;
                           }
       });
    }
}
