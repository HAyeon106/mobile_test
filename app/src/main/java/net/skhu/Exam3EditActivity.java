package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Exam3EditActivity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);

        arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");

        recyclerViewAdapter = new RecyclerViewAdapter(this, arrayList);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerViewAdapter);

        Button b = (Button)findViewById(R.id.btnSave);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = (EditText)findViewById(R.id.editText);
                String s = e.getText().toString();
                arrayList.add(s);
                e.setText("");
                recyclerViewAdapter.notifyDataSetChanged();
            }
        });

         @Override
         public boolean onOptionsMenu(Menu menu){
             getMenuInflater().inflate(R.menu.menu_recycler_view, menu);
             MenuItem menuItem = menu.
        }
    }
}
