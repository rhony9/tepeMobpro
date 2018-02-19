package org.d3ifcool.tepe5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_kelas);
        ArrayList<String> listKelas = new ArrayList<>();
        listKelas.add("D3IF-40-01");
        listKelas.add("D3IF-40-02");
        listKelas.add("D3IF-40-03");
        listKelas.add("D3IF-40-04");

        ArrayAdapter<String> kelasAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listKelas);

        listView.setAdapter(kelasAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0 : {
                        startActivity(new Intent(MainActivity.this, Kelas01Activity.class));
                        break;
                    }case 1 : {
                        startActivity(new Intent(MainActivity.this, Kelas02Activity.class));
                        break;
                    }case 2 : {
                        startActivity(new Intent(MainActivity.this, Kelas03Activity.class));
                        break;
                    }case 3 : {
                        startActivity(new Intent(MainActivity.this, Kelas04Activity.class));
                        break;
                    }
                }
            }
        });
    }
}
