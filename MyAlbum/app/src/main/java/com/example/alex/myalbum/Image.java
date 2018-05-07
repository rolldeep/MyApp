package com.example.alex.myalbum;

import android.support.annotation.NonNull;

public class Image {

    @NonNull
    private final String url;

    public Image(@NonNull String url) { this.url = url; }

    @NonNull
    public String getUrl() {
        return url;
    }
}
