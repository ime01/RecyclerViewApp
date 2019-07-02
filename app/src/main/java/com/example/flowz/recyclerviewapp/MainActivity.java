package com.example.flowz.recyclerviewapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  List<Club> myclubs;
    RecyclerView myRecyclerView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView =(RecyclerView)findViewById(R.id.my_recycleView);
        myRecyclerView.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(context);
        myRecyclerView.setLayoutManager(manager);

//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myclubs);

        initializeData();
        initializeAdapter();
    }
    private void initializeData() {
        myclubs = new ArrayList<>();
        myclubs.add(new Club("Hello this is a money image", R.drawable.ic_attach_money_black_24dp));
        myclubs.add(new Club("this is an assignment image ", R.drawable.ic_assignment_black_24dp));
        myclubs.add(new Club("this is a cloud backup image ", R.drawable.ic_backup_black_24dp));
        myclubs.add(new Club("this is a cake image ", R.drawable.ic_cake_black_24dp));
        myclubs.add(new Club("this is an app launcher image ", R.drawable.ic_apps_black_24dp));
        myclubs.add(new Club("this is a call end image ", R.drawable.ic_call_end_black_24dp));
        myclubs.add(new Club("this is a bluetooth image ", R.drawable.ic_bluetooth_black_24dp));
        myclubs.add(new Club("money is important ", R.drawable.ic_attach_money_black_24dp));
        myclubs.add(new Club("copy to a clipboard ", R.drawable.ic_assignment_black_24dp));
        myclubs.add(new Club("always remember to backup stuff ", R.drawable.ic_backup_black_24dp));
        myclubs.add(new Club("gotta have cake, cake, cake! ", R.drawable.ic_cake_black_24dp));
        myclubs.add(new Club("take pictures, more and more pictures", R.drawable.ic_camera_alt_black_24dp));

    }

    private void initializeAdapter() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myclubs);
        myRecyclerView.setAdapter(adapter);
    }
}
