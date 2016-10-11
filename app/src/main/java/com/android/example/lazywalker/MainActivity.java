package com.android.example.lazywalker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        TextView tv5 = (TextView) findViewById(R.id.tv5);
        editText = (EditText) findViewById(R.id.editText);

        String distance = editText.getText().toString();

        Dijkstra dijkstra=new Dijkstra();

        if (distance==dijkstra.output)
        {
            Toast.makeText(this,"You WIn",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"You Loose",Toast.LENGTH_SHORT).show();
        }



    }
}
