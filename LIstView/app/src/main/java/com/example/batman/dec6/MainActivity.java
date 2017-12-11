package com.example.batman.dec6;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends Activity {

    private List<Product> products = DataProvider.productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = getResources().getStringArray(R.array.clothing);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //                                android.R.layout.simple_list_item_1,
        //                              android.R.id.text1,
        //                              items
        //                        );
        ProductListAdapter adapter = new ProductListAdapter(
                this,
                R.layout.list_item,
                products
        );
        ListView lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, ("Item clicked: "+i), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,MyDetailActivity.class);
                Product product = products.get(i);
                intent.putExtra("PRODUCT_ID",product.getProductId());
                startActivity(intent);
            }
        });
    }
}
