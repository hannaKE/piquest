package com.example.hanna.piquest;

import android.content.SharedPreferences;

import java.util.*;
import java.util.Objects;

/**
 * Created by Amanda on 2014-12-19.
 */
public class SingletonGameManager implements QuestManager {

    private static SingletonGameManager instance = null;
    private ArrayList<QuestManager> listOfQuests;

    public static SingletonGameManager getGameManager() {
        if (instance == null) {
            instance = new SingletonGameManager();
        }
        return instance;
    }

    public static void createTestQuests(){
        ArrayList<String> anv = new ArrayList<String>();
        anv.add("Chrill");
        anv.add("Mandy Lu");
        anv.add("HenKE");

        ArrayList<String> themes = new ArrayList<String>();
        themes.add("X-mas");
        themes.add("Happy Kid");
        themes.add("Blood death and gore");

        Quest q = new Quest(10, "TestQuest1", anv, themes);
    }

    public void startGame() {

    }

    public void startTimer() {

    }

    public void addParticipants() {

    }

    public void setTime() {

    }

    public double getTime() {
        return 0;
    }

    @Override
    public ArrayList<String> getAllThemes() {
        return null;
    }

    @Override
    public String getAllParticipants() {
        return null;
    }

    @Override
    public String getPlace() {
        return null;
    }

    @Override
    public void saveQuest(SharedPreferences sp) {

    }

    @Override
    public ArrayList<Objects> getPhotoAlbum() {
        return null;
    }
}