package com.example.alex.myalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ImageAdapter(generateImages()));
    }

    private List<Image> generateImages() {
        List<Image> images = new ArrayList<Image>();
        images.add(new Image("https://yadi.sk/i/mSpuDkQt3VGE4v"));
        images.add(new Image("https://mtdata.ru/u28/photo96CE/20466331848-0/original.jpg"));
        images.add(new Image("https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/hires/2017/whatisspacet.jpg"));
        return images;
    }
}
