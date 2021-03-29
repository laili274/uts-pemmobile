package com.example.yoga;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    int list_gambar [] ={
            R.drawable.redmi6, R.drawable.oppoa52020, R.drawable.samsungj2prime, R.drawable.googlepixel2, R.drawable.realmec1, R.drawable.vivoy53, R.drawable.huaweiy6, R.drawable.asusmaxprom1, R.drawable.redmis2, R.drawable.samsungj3pro
    };

    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context context, List<Model> modelList) {
        mContext = context;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder)view.getTag();
            holder.mTitleTv.setText(modelList.get(position).getTitle());
            holder.mDescTv.setText(modelList.get(position).getDesc());

            holder.mIconIv.setImageResource(modelList.get(position).getIcon());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (modelList.get(position).getTitle().equals("Redmi 6")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Redmi 6");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.599.000 \n" +
                                "RAM 3 GB\n" +
                                "ROM 32 GB\n" +
                                "CHIPSET Mediatek MT6762 Helio P22\n" +
                                "OS Android 8.1\n" +
                                "Baterai Li-Po 3000mAH\n" +
                                "Kamera Depan 5MP, f/2.2\n" +
                                "Dual Kamera Belakang \n" +
                                "12 MP, f/2.2 PDAF\n" +
                                "5 MP, F/2.2 Depth Sensor\n" +
                                "Jaringan GSM/CDMA/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Oppo A5 2020")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Oppo A5 2020");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 2.699.000\n" +
                                "RAM 4 GB\n" +
                                "ROM 64 GB\n" +
                                "Chipset SDM655 Snapdragon 655\n" +
                                "OS Android 9.0\n" +
                                "Baterai Li-Po 5000 mAH\n" +
                                "Kamera Depan 8 MP, f/2.0\n" +
                                "Quad Kamera Belakang\n" +
                                "12 MP, f/1.8 PDAF\n" +
                                "8 MP, Ultrawide\n" +
                                "2 MP, f/2.4\n" +
                                "2 MP, f/2.4 depth sensor\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Samsung J2 Prime")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Samsung J2 Prime");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.250.000\n" +
                                "RAM 1,5 GB\n" +
                                "ROM 8 GB\n" +
                                "Chipset Mediatek MT6737T\n" +
                                "OS Android 6.0.1\n" +
                                "Baterai Li-Ion 2600 mAH\n" +
                                "Kamera Depan 5 MP, f/2.2\n" +
                                "Kamera Belakang 8 MP, f/2.2\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Google Pixel 2")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Google Pixel 2");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 4.500.000\n" +
                                "RAM 4 GB\n" +
                                "ROM 64 GB\n" +
                                "Chipset Snapdragon 835\n" +
                                "OS Android 8.0\n" +
                                "Baterai Li-ion 2700 mAh\n" +
                                "Kamera Depan 8 MP, f/2.4\n" +
                                "Kamera Belakang 12 MP, f/2.8\n" +
                                "Jaringan GSM/CDMA/HSPA/EVDO/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Realme C1")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Realme C1");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.499.000\n" +
                                "RAM 2 GB\n" +
                                "ROM 16 GB\n" +
                                "Chipset Snapdragon 450\n" +
                                "OS Android 8.1\n" +
                                "Baterai Li-Ion 4230 mAH\n" +
                                "Kamera Depan 5 MP, f/2.2\n" +
                                "Dual Kamera Belakang\n" +
                                "13 MP, f/2.2 PDAF\n" +
                                "2 MP, f/2.4 depth sensor \n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Vivo Y53")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Vivo Y53");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.299.000\n" +
                                "RAM 2 GB\n" +
                                "ROM 16 GB\n" +
                                "Chipset Qualcomm MSM8917 Snapdragon 425\n" +
                                "OS Android 6.0\n" +
                                "Baterai Li-ion 2500 mAH\n" +
                                "Kamera Depan 5 MP.f/2.2\n" +
                                "Kamera Belakang 8 MP, f/2.0\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Huawei Y6")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Huawei Y6");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.399.000\n" +
                                "RAM 2 GB\n" +
                                "ROM 16 GB\n" +
                                "Chipset Qualcomm MSM8917 Snapdragon 425\n" +
                                "OS Android 8.0\n" +
                                "Baterai Li-Ion 3000 mAh\n" +
                                "Kamera Depan 5 MP\n" +
                                "Kamera Belakang 13 MP PDAF\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Asus Zenfone Max Pro M1")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Asus Zenfone Max Pro M1");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 2.399.000\n" +
                                "RAM 6 GB\n" +
                                "ROM 64 GB\n" +
                                "Chipset Snapdragon 636\n" +
                                "OS Android 8.1\n" +
                                "Baterai Li-Po 5000 mAH\n" +
                                "Kamera Depan 8 MP, f/2.2\n" +
                                "Dual Kamera Belakang\n" +
                                "16 MP, f/2.0 PDAF\n" +
                                "5 MP, f/2.4 depth sensor\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Redmi S2")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Redmi S2");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 2.200.000\n" +
                                "RAM 4 GB\n" +
                                "ROM 32 GB\n" +
                                "Chipset Snapdragon 625\n" +
                                "OS Android 8.1\n" +
                                "Baterai Li-Po 3080 mAh\n" +
                                "Kamera Depan 16 MP, f/2.0\n" +
                                "Dual Kamera Belakang\n" +
                                "12 MP, f/2.2 PDAF\n" +
                                "5 MP, depth sensor\n" +
                                "Jaringan GSM/CDMA/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                    if (modelList.get(position).getTitle().equals("Samsung J3 Pro")){
                        Intent intent = new Intent(mContext, NewActivity.class);
                        intent.putExtra("ActionBarTitle","Samsung J3 Pro");
                        intent.putExtra("imgG", list_gambar[position]);
                        intent.putExtra("contentTv", "Harga 1.400.000\n" +
                                "RAM 2 GB\n" +
                                "ROM 16 GB\n" +
                                "Chipset Exynos 7570 Quad\n" +
                                "OS Android 7.0\n" +
                                "Baterai Li-ion 2400 mAH\n" +
                                "Kamera Depan 5 MP, f/2.2\n" +
                                "Kamera Belakang 13 MP, f/1.9\n" +
                                "Jaringan GSM/HSPA/LTE");
                        mContext.startActivity(intent);
                    }
                }
            });
        }



        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                    .contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
