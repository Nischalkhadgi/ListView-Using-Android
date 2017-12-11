package com.example.batman.dec6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {
    private List<Product> products;

    public ProductListAdapter(Context context, int resource, List<Product> objects) {
        super(context, resource, objects);
        products = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item,parent,false);

        }
        Product product = products.get(position);
        TextView nameText = convertView.findViewById(R.id.textView3);
        nameText.setText(product.getName());

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String price = formatter.format(product.getPrice());
        TextView priceText = convertView.findViewById(R.id.textView4);
        priceText.setText(price);

        return convertView;
    }
}