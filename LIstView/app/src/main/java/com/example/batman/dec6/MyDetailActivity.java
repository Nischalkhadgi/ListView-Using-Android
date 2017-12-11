package com.example.batman.dec6;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_linear_layout);

        String productId = getIntent().getStringExtra("PRODUCT_ID");
        Product product = DataProvider.productMap.get(productId);

        TextView title = findViewById(R.id.textView);
        title.setText(product.getName());

        TextView description = findViewById(R.id.textView2);
        description.setText(product.getDescription());
    }
}
