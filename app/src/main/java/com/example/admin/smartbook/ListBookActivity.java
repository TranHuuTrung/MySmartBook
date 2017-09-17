package com.example.admin.smartbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListBookActivity extends AppCompatActivity {
    ListView lv_view;
    //các hình ảnh của từng Item trong List View
    public static int[] imgAvatar = {R.drawable.icon_book, R.drawable.icon_like, R.drawable.icon_test, R.drawable.icon_write};
    //nội dung của từng Item trong List View
    public  static String [] tvNoiDung ={"Pháp Luật", "Phưu Lưu", "Nấu Ăn - Ẩm Thực", "Lãng Mạn "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_book);

        lv_view = (ListView) findViewById(R.id.lv_view);

        CustomAdapter adapter = new CustomAdapter(ListBookActivity.this, tvNoiDung,imgAvatar );
        lv_view.setAdapter(adapter);

    }
}
