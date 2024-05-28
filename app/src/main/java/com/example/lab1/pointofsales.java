package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class pointofsales extends AppCompatActivity {

    EditText quantityMilk, quantityWatch, quantityPen, quantityBread;
    EditText priceMilk, priceWatch, pricePen, priceBread;
    TextView grandTotal, netPay;
    Button calculateTotal, applyDiscount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointofsales);

        quantityMilk = findViewById(R.id.quantityMilk);
        quantityWatch = findViewById(R.id.quantityWatch);
        quantityPen = findViewById(R.id.quantityPen);
        quantityBread = findViewById(R.id.quantityBread);

        priceMilk = findViewById(R.id.priceMilk);
        priceWatch = findViewById(R.id.priceWatch);
        pricePen = findViewById(R.id.pricePen);
        priceBread = findViewById(R.id.priceBread);

        grandTotal = findViewById(R.id.grandTotal);
        netPay = findViewById(R.id.netPay);

        calculateTotal = findViewById(R.id.calculateTotal);
        applyDiscount = findViewById(R.id.applyDiscount);

        calculateTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    calculateGrandTotal();
                } catch (NumberFormatException e) {
                    Toast.makeText(pointofsales.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(pointofsales.this, "An error occurred: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        applyDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    applyDiscount();
                } catch (NumberFormatException e) {
                    Toast.makeText(pointofsales.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(pointofsales.this, "An error occurred: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void calculateGrandTotal() {
        double total = 0.0;

        total += getItemTotal(quantityMilk, priceMilk);
        total += getItemTotal(quantityWatch, priceWatch);
        total += getItemTotal(quantityPen, pricePen);
        total += getItemTotal(quantityBread, priceBread);

        grandTotal.setText(String.format("Grand Total: $%.2f", total));
        netPay.setText(String.format("Net Pay: $%.2f", total));
    }

    private double getItemTotal(EditText quantity, EditText price) {
        String quantityStr = quantity.getText().toString();
        String priceStr = price.getText().toString();

        if (quantityStr.isEmpty() || priceStr.isEmpty()) {
            return 0.0;
        }

        int qty = Integer.parseInt(quantityStr);
        double unitPrice = Double.parseDouble(priceStr);

        return qty * unitPrice;
    }

    private void applyDiscount() {
        String grandTotalStr = grandTotal.getText().toString().replace("Grand Total: $", "");
        if (grandTotalStr.isEmpty()) {
            Toast.makeText(this, "Please calculate the grand total first", Toast.LENGTH_SHORT).show();
            return;
        }

        double total = Double.parseDouble(grandTotalStr);
        double discount = total * 0.15;
        double netPayAmount = total - discount;
        netPay.setText(String.format("Net Pay: $%.2f", netPayAmount));
    }
}
