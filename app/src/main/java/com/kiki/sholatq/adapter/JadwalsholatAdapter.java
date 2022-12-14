package com.kiki.sholatq.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.kiki.sholatq.R;

public class JadwalsholatAdapter extends RecyclerView.Adapter<JadwalsholatAdapter.MyHolder>{


    String [] name_jadwal_sholat;
    String [] jadwal_sholat ;

        Context ctx;


    public JadwalsholatAdapter(String[] name_jadwal_sholat, String[] jadwal_sholat, Context ctx) {
        this.name_jadwal_sholat = name_jadwal_sholat;
        this.jadwal_sholat = jadwal_sholat;
        this.ctx = ctx;
    }

    @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_jadwal_sholat,parent, false);
            MyHolder holder = new MyHolder(layout);
            return holder;

        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {
            holder.name_jadwalsholat.setText(name_jadwal_sholat[position]);
            holder.value_jadwalsholat.setText(jadwal_sholat[position]);


        }

        @Override
        public int getItemCount()
        {
            return jadwal_sholat.length;
        }

        public class MyHolder extends RecyclerView.ViewHolder {
            TextView name_jadwalsholat,value_jadwalsholat;

            public MyHolder(View v)
            {
                super(v);
                name_jadwalsholat = v.findViewById(R.id.name_jadwal_sholat);
                value_jadwalsholat = v.findViewById(R.id.value_jadwal_sholat);



            }

        }
}
