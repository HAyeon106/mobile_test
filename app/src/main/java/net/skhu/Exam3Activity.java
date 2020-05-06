package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import java.io.Serializable;
import java.util.ArrayList;

public class Exam3Activity extends AppCompatActivity {

    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_recycler_view,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.actionc_create){
            Intent intent = new Intent(this, Exam3EditActivity.class);
            startActivityForResult(intent, 0);
        }
        return super.onOptionsItemSelected(item);
    }

    protected void onActivityResult(int requestCod, int resultCode, Intent data){
        super.onActivityResult(resultCode, resultCode, data);
        if(resultCode == 0){
            Bundle bundle = data.getExtras();
            String s = bundle.getSerializable("").toString();
            arrayList.add(s);
        }
    }
}
