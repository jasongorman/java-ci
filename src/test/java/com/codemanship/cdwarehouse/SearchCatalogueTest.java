package com.codemanship.cdwarehouse;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SearchCatalogueTest {

    @Test
    public void singleMatchFound(){
        String artist = "Peter Gabriel";
        String title = "So";
        CD cd = new CD(artist, title, 10);
        Catalogue catalogue = new Catalogue(Arrays.asList(cd));
        assertEquals(cd, catalogue.search(artist, title).get(0));
    }
}
