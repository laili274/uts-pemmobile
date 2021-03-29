package com.example.yoga;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
//import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Items List");

        title = new String[]{"Redmi 6", "Oppo A5 2020", "Samsung J2 Prime", "Google Pixel 2", "Realme C1", "Vivo Y53", "Huawei Y6", "Asus Zenfone Max Pro M1", "Redmi S2", "Samsung J3 Pro"};
        description = new String[]{"Harga 1.599.000", "Harga 2.699.000", "Harga 1.250.000", "Harga 4.500.000", "Harga 1.499.000", "Harga 1.299.000", "Harga 1.399.000", "Harga 2.399.000", "Harga 2.200.000", "Harga 1.400.000"};
        icon = new int[]{R.drawable.redmi6, R.drawable.oppoa52020, R.drawable.samsungj2prime, R.drawable.googlepixel2, R.drawable.realmec1, R.drawable.vivoy53, R.drawable.huaweiy6, R.drawable.asusmaxprom1, R.drawable.redmis2, R.drawable.samsungj3pro};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);

            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this, arrayList);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void about(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}