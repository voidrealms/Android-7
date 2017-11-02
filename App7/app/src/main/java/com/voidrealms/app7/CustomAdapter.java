package com.voidrealms.app7;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by rootshell on 3/11/17.
 */

public class CustomAdapter extends ArrayAdapter<HashMap<Integer,String>> {

    private HashMap<Integer,String> items;
    Context con;


    public CustomAdapter(Context context, int resource, HashMap<Integer,String> map ) {
        super(context, resource);

        items = map;
        con = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        LayoutInflater inflater = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.listitem, null,true);

        TextView txt = (TextView)row.findViewById(R.id.txtItem);
        ImageView img = (ImageView)row.findViewById(R.id.imgItem);

        txt.setText(items.get(position).toString());

        Context context = img.getContext();
        int id = context.getResources().getIdentifier("ico" + position,"drawable", context.getPackageName());
        img.setImageResource(id);

        return row;
    }
}
