package com.example.l.medhelper.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.l.medhelper.Adapters.NumbersRecyclerViewAdapter;
import com.example.l.medhelper.Models.NumbersModel;
import com.example.l.medhelper.R;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    private String marzName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        marzName = getIntent().getExtras().getString("name_of_marz");
        RecyclerView recyclerView = findViewById(R.id.numbers_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(NumbersActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        initRecyclerView(recyclerView);
    }

    private void initRecyclerView(RecyclerView recyclerView) {
        List<NumbersModel> numbers = new ArrayList<>();
        initList(numbers, marzName);
        NumbersRecyclerViewAdapter adapter = new NumbersRecyclerViewAdapter(NumbersActivity.this, numbers);
        recyclerView.setAdapter(adapter);
    }

    private void initList(List<NumbersModel> list, String marzName) {
        switch (marzName) {
            case "Aragatsotn":
                list.add(new NumbersModel("Tsaghkahovit Medical Center", "Hoktemberyan St., 16 Building", "+37425720636"));
                list.add(new NumbersModel("Aparan Medical Center", "Garegin Nzhdehi St., 21 Building", "+37425224417"));
                list.add(new NumbersModel("Ashtarak Medical Center", "Narekatsu St., 61 Building", "+37423232329"));
                list.add(new NumbersModel("Talin Medical Center", "Kotanyan St., 10 Building", "+37424922288"));
                break;
            case "Ararat":
                list.add(new NumbersModel("Polyclinic Of \"ARARAT HOSPITAL\" Medical Center", "Khanjyan St., 59 Building", "+37423444283"));
                list.add(new NumbersModel("\"ARARAT HOSPITAL\" Medical Center", "Khanjyan St., 59 Building", "+37423443556"));
                list.add(new NumbersModel("Artashat Medical Center", "Aram Khachatryan St., 116 Building", "+37423525364"));
                list.add(new NumbersModel("Masis Medical Center", "Mkhitar Heratsu St., 1 Building", "+37423643000"));
                list.add(new NumbersModel("Vedi Medical Center", "Gai St., 2 Building", "+37423423613"));
                break;
            case "Armavir":
                list.add(new NumbersModel("\"Children Of Jesus\" Health Center", "Baghramyan St., 32 Building", "+37477260056"));
                list.add(new NumbersModel("\"Ejmiatsin\" Medical Center", "Marshal Baghramyan St., 26 Building", "+37423155880"));
                list.add(new NumbersModel("Armavir Medical Center", "Shahumyan St., 3 Building", "+37423722640"));
                list.add(new NumbersModel("Masis Medical Center", "Mkhitar Heratsu St., 1 Building", "+37423643000"));
                list.add(new NumbersModel("Metsamor  Medical Center", "24a Building", "+37423733381"));
                break;
            case "Gegharkunik":
                list.add(new NumbersModel("Gavar Medical Center", "Azatutyan St., 21 Building", "+37426423353"));
                list.add(new NumbersModel("Martuni Medical Center", "Getapnya St., 2/17 Building", "+37426242772"));
                list.add(new NumbersModel("Sevan Medical Center", "Nairyan St., 169 Building", "+37426122650"));
                break;
            case "Kotayk":
                list.add(new NumbersModel("Garni Health Center", "Jemma Alekyan St., 20 Building", "+37422264003"));
                list.add(new NumbersModel("Abovyan Medical Center", "Hatisi St., 6 Building", "+37422222203"));
                list.add(new NumbersModel("Charentsavan Medical Center", "Yeritasardutyan St., 8 Building", "+37422644530"));
                list.add(new NumbersModel("Clinic Of Neuroses", "R. Safaryan St., 10 Building", "+37493504253"));
                list.add(new NumbersModel("Hrazdan Medical Center", "Marshal Baghramyan District, Purakayin St., 32 Building", "+37422324447"));
                list.add(new NumbersModel("Nairi Medical Center", "Charentsi St., 196 Building", "+37422422375"));
                break;
            case "Lori":
                list.add(new NumbersModel("Alaverdi Medical Center", "Sayat-Novai St., 20 Building", "+37425323312"));
                list.add(new NumbersModel("Spitak Medical Center", "Yerevanyan Highway, 1 Building", "+37425522308"));
                list.add(new NumbersModel("Stepanavan Medical Center", "Surb Vardani St., 1 Building", "+37425623228"));
                list.add(new NumbersModel("Tashir Medical Center", "Griboyedovi St., 3 Building", "+37425422103"));
                list.add(new NumbersModel("\"LoriMed\" Medical Center", "Taterakan St., 6/1 Building", "+37432223111"));
                list.add(new NumbersModel("\"NorMed\" Medical Center", "Garegin Nzhdehi St., 24 Building", "+37432224090"));
                list.add(new NumbersModel("Vanadzor Medical Center", "Banaki St., 8 Building", "+37432223658"));
                break;
            case "Shirak":
                list.add(new NumbersModel("Gyumri Medical Center", "Garegin Nzhdehi St., 3/3 Building", "+37431230311"));
                list.add(new NumbersModel("Akhuryan Medical Center", "Akhuryani Highway, 14 Building", "+37431270855"));
                list.add(new NumbersModel("Artik Medical Center", "Baghramyan St., 2 Building", "+37424453603"));
                list.add(new NumbersModel("\"Apaven\" Medical Center", "Shirakatsu St.", "+37431248502"));
                list.add(new NumbersModel("\"NorMed\" Medical Center", "Tigran Metsi St., 8 Building", "+37431232733"));
                break;
            case "Syunik":
                list.add(new NumbersModel("Goris Medical Center", "Grigor Tatevatsu St., 31 Building", "+37428422152"));
                list.add(new NumbersModel("Kajaran Medical Center", "Bakuntsi St., 1 Building", "+37428533511"));
                list.add(new NumbersModel("Meghri Medical Center", "Gortsararneri St., 42 Building", "+37498103111"));
                list.add(new NumbersModel("Sisian Medical Center", "Charentsi St., 14 Building", "+37428323501"));
                break;
            case "Tavush":
                list.add(new NumbersModel("\"Tavush\" Medical Center", "Sayat-Novai St., 7/3 Building", "+37426827678"));
                list.add(new NumbersModel("Berd Medical Center", "Alek Manukyan St., 25 Buildingg", "+37426723254"));
                list.add(new NumbersModel("Ijevan Medical Center", "Nalbandyan St., 1 Building", "+37426340313"));
                list.add(new NumbersModel("Noyemberyan Medical Center", "Garegin Nzhdehi St., 15 Building", "+37426623281"));
                break;
            case "Vayots Dzor":
                list.add(new NumbersModel("Yeghegnadzor Medical Center", "Vayki St., 1 Building", "+37428123016"));
                list.add(new NumbersModel("\"Sanjer\" Medical Center", "Jermuk region", "+37460741234"));
                break;
            case "Yerevan":
                list.add(new NumbersModel("\"Surb Astvatsamayr\" Medical Center", "Artashisyan St., 46/1 Building", "+37410464115"));
                list.add(new NumbersModel("\"Armenia\" Republic Medical Center", "Margaryan St., 6 Building", "+37410318246"));
                list.add(new NumbersModel("\"Erebouni\" Medical Center", "Titogradyan St., 14 Building", "+37410477070"));
                break;
        }
    }
}
