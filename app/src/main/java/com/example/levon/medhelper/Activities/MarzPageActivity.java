package com.example.levon.medhelper.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.levon.medhelper.Adapters.MarzRecyclerViewAdapter;
import com.example.levon.medhelper.Models.ModelOfMarz;
import com.example.levon.medhelper.R;

import java.util.ArrayList;
import java.util.List;

public class MarzPageActivity extends AppCompatActivity {

    private List<ModelOfMarz> listOfMarz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marz_page);
        initListOfMarz();
        RecyclerView recyclerView = findViewById(R.id.marzer_recycler_view);
        MarzRecyclerViewAdapter adapter = new MarzRecyclerViewAdapter(MarzPageActivity.this, listOfMarz);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MarzPageActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
    }

    private void initListOfMarz() {
        listOfMarz = new ArrayList<>();
        listOfMarz.add(new ModelOfMarz("Aragatsotn"));
        listOfMarz.add(new ModelOfMarz("Ararat"));
        listOfMarz.add(new ModelOfMarz("Armavir"));
        listOfMarz.add(new ModelOfMarz("Gegharkunik"));
        listOfMarz.add(new ModelOfMarz("Kotayk"));
        listOfMarz.add(new ModelOfMarz("Lori"));
        listOfMarz.add(new ModelOfMarz("Shirak"));
        listOfMarz.add(new ModelOfMarz("Syunik"));
        listOfMarz.add(new ModelOfMarz("Tavush"));
        listOfMarz.add(new ModelOfMarz("Vayots Dzor"));
        listOfMarz.add(new ModelOfMarz("Yerevan"));
    }
}
