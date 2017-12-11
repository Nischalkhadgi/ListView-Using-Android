package com.example.batman.dec6;

import android.support.v7.app.AppCompatActivity;


public class Product extends AppCompatActivity {
        private String productId;
        private String name;
        private String description;
        private double price;

        public Product(String productId, String name, String description, double price){
            this.productId = productId;
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public String getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }
    }
