package com.example.hanna.piquest;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Amanda on 2014-12-19.
 */
public class Quest {

    private int time;
    private ArrayList<String> participants;
    private ArrayList<Objects> photoAlbum;
    private ArrayList<String> themeList;
    private String title;

    public Quest(int time, String title, ArrayList<String> participants, ArrayList<String> themes){
        this.time = time;
        this.title = title;
        this.participants = participants;
        this.themeList = themes;
    }

    public Quest(){
        System.out.println("bajSkorv!");
    }
}
