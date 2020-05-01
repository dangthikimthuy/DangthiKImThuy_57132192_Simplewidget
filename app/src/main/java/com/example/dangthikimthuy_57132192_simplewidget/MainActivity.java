package com.example.dangthikimthuy_57132192_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Ten, NgaySinh, STK;
    RadioGroup GioiTinh;
    CheckBox xemphiem, nghenhac, cafe, onha, nauan;
    Button XacNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ten = findViewById(R.id.Ten);
        NgaySinh = findViewById(R.id.NgaySinh);
        STK = findViewById(R.id.stk);
        GioiTinh = findViewById(R.id.gioitinh);
        xemphiem = findViewById(R.id.xemphim);
        nghenhac = findViewById(R.id.nghenhac);
        cafe = findViewById(R.id.cafe);
        onha = findViewById(R.id.onha);
        nauan = findViewById(R.id.nauan);
        XacNhan = findViewById(R.id.xacnhan);
        XacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ketqua = "";
                ketqua += "Tên bạn" + Ten.getText() + toString() + ";";
                ketqua += "\n Ngày sinh " + NgaySinh.getText().toString() + ";";
                switch (GioiTinh.getCheckedRadioButtonId()) {
                    case R.id.nam:
                        ketqua += "\n Giới tính: nam";
                        break;
                    case R.id.nu:
                        ketqua += "\n Giới tính: nữ";
                        break;
                }
                ketqua += "\n Sở thích";
                if (xemphiem.isChecked()) {
                    ketqua = ketqua + xemphiem.getText().toString() + ";";
                }
                if (nghenhac.isChecked()) {
                    ketqua = ketqua + nghenhac.getText().toString() + ";";
                }
                if (cafe.isChecked()) {
                    ketqua = ketqua + cafe.getText().toString() + ";";
                }
                if (onha.isChecked()) {
                    ketqua += ketqua + onha.getText().toString() + ";";
                }
                if (nauan.isChecked()) {
                    ketqua = ketqua + nauan.getText().toString() + ";";
                }
                ketqua += XacNhan.getText() + ";";
                Toast.makeText(getApplicationContext(), ketqua, Toast.LENGTH_LONG).show();
            }
        });
    }
}
