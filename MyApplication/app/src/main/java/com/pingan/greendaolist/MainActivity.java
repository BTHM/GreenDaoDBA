package com.pingan.greendaolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static DBManager mInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CerListModel model = new CerListModel(2, "1", "哈哈哈", (float) 2015);

        long l = DBManager.getInstance(this).insertUser(model);
        System.out.println("l="+l);
    }


}
