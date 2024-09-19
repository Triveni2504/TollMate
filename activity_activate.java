package com.darkness.WSafety;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import android.content.Intent;
import android.os.Bundle;

public class activity_activate extends AppCompatActivity {
    String s1, s2, s3;
    EditText et1, et2, et3;
    TextView tv1;
    @Override

    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activate);
        et1=(EditText)findViewById(R.id.et_name);
        et2=(EditText)findViewById(R.id.et_vno);
        et3=(EditText)findViewById(R.id.et_status);
        tv1=(TextView)findViewById(R.id.tv_output);
    }

    public void save (View view)
    {   s1 = et1.getText().toString();
        s2 = s1+ " "+et2.getText().toString()+"\n";
        //s3 = s2+ " "+et3.getText().toString()+"\n";


        try
        { FileOutputStream fos = openFileOutput("file1.txt", MODE_APPEND);
            fos.write(s2.getBytes());
        }
        catch (FileNotFoundException e)
        { e.printStackTrace(); }

        catch (Exception e)
        { e.printStackTrace(); }
    }

    public void load (View v)
    {  try
    {    FileInputStream fis = openFileInput("file1.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String text;
        while ((text=br.readLine())!= null)
        {   sb.append(text);
            sb.append("\n");
        }

        tv1.setText (sb.toString());
    }
    catch (FileNotFoundException e)
    { e.printStackTrace(); }

    catch (Exception e)
    { e.printStackTrace(); }
    }




}