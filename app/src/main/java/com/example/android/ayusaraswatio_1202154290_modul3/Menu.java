package com.example.android.ayusaraswatio_1202154290_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    RecyclerView rv;
    menuAdapter adapter;
    List<pilihAir> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("List Air");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
        }
        initdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 2));
        }else {
            rv.setLayoutManager(new GridLayoutManager(Menu.this, 1));
        }
    }

    private void initdata() {
        listmenu.add(new pilihAir(R.drawable.ades, "Ades", "ADES merupakan air minum dalam kemasan yang terbuat dari mata air gunung pilihan. \n"));
        listmenu.add(new pilihAir(R.drawable.amidis, "Amidis", "AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi. \n"));
        listmenu.add(new pilihAir(R.drawable.aqua, "Aqua", "AQUA adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia \n"));
        listmenu.add(new pilihAir(R.drawable.cleo, "Cleo", "CLEO adalah air jenis ini terasa lebih ringan dan tidak berasa bila diminum \n"));
        listmenu.add(new pilihAir(R.drawable.club, "Club", "CLUB adalah merek air minum dalam kemasan atau air mineral di Indonesia. \n"));
        listmenu.add(new pilihAir(R.drawable.equil, "Equil", "EQUIL adalah air mineral alami yang sangat ringan dan halus. \n"));
        listmenu.add(new pilihAir(R.drawable.evian, "Evian", "EVIAN adalah air jenis ini terasa lebih ringan yang terbuat dari mata air gunung pilihan.  \n"));
        listmenu.add(new pilihAir(R.drawable.leminerale, "Le Minerale", "LE MINERALE adalah sebuah merek air minum dalam kemasan \n"));
        listmenu.add(new pilihAir(R.drawable.nestle, "Nestle", "NESTLE dalah sebuah merek air minum dalam kemasan (AMDK) yang terasa lebih ringan  \n"));
        listmenu.add(new pilihAir(R.drawable.pristine, "Pristine", "PRISTINE dalah air minum kesehatan yang diproses melalui sistem distilasi. \n"));
        listmenu.add(new pilihAir(R.drawable.vit, "Vit", "VIT adalah merek air minum dalam kemasan atau air mineral di Indonesia. \n"));
        adapter = new menuAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}



