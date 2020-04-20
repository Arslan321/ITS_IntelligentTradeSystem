package com.example.its;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {


    LayoutInflater inflater;
    Context context;
    ArrayList<Model> arrayList;
    public Adapter(Context context , ArrayList<Model> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
        inflater =(LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Model getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.listitems,null);

        ImageView imageView = view.findViewById(R.id.img_first_pair);
        ImageView lastimgview = view.findViewById(R.id.img_last_pait);
        TextView textView_time = view.findViewById(R.id.time);
        TextView textView_date = view.findViewById(R.id.date);
        TextView textView_pairs = view.findViewById(R.id.text_pairs);
        TextView textView_text_value_high = view.findViewById(R.id.text_value_high);
        TextView textView_text_value_low = view.findViewById(R.id.text_value_low);
        Model model = getItem(i);
        imageView.setImageResource(model.getFirst_pair_imgs());
        lastimgview.setImageResource(model.getLast_pair_imgs());
        textView_pairs.setText(model.getPairs());
        textView_time.setText(model.getTime());
        textView_date.setText(model.getDate());
        textView_text_value_low.setText("Low "+model.getValue_low());
        textView_text_value_high.setText("High "+model.getValue_high());

        return view;
    }


}
