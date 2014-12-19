package com.example.hanna.piquest;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Amanda on 2014-12-19.
 */
public interface QuestManager {

    public ArrayList<String> getAllThemes();
    public String getAllParticipants();
    public String getPlace();
    public void saveQuest(SharedPreferences sp);
    public ArrayList<Objects> getPhotoAlbum();


// Quest <-- en klass, är // deltagare, tid, plats, themes <-- av tyepen array, etc.
// Theme <-- egen klass, innehåller bilder?
// en abstrakt klass/interface som heter quest
// pågående quest class
// finished quest class
//

}
