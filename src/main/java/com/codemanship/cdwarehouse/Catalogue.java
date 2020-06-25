package com.codemanship.cdwarehouse;

import java.util.List;

public class Catalogue {
    private final List<CD> titles;

    public Catalogue(List<CD> titles) {

        this.titles = titles;
    }

    public List<CD> search(String artist, String title) {
        return titles;
    }
}
