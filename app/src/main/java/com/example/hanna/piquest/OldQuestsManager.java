package com.example.hanna.piquest;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Amanda on 2014-12-19.
 */
public class OldQuestsManager implements QuestManager {

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
