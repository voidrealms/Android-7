package com.voidrealms.app7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap items = new HashMap<Integer,String>();
    private ListView lstMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstMain = (ListView)findViewById(R.id.lstMain);

        for(int i = 0; i < 5; i ++)
        {
            items.put(i,"Item number " + i);
        }

        CustomAdapter adapter = new CustomAdapter(this,0,items);
        lstMain.setAdapter(adapter);

    }

}
