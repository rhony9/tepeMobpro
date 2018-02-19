package org.d3ifcool.tepe5;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Chevalier on 2/19/2018.
 */

public class LoadJSON {
    private Context context;
    public LoadJSON(Context context) {
        this.context = context;
    }

    public ArrayList<Mahasiswa> loadJSONFromAsset(String kelas) {
        ArrayList<Mahasiswa> locList = new ArrayList<>();
        String json = null;
        try {
            InputStream is = context.getAssets().open("locations.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        try {
            JSONObject obj = new JSONObject(json);
            JSONObject objectMhs = obj.getJSONObject("data");
            JSONArray m_jArry = obj.getJSONArray(kelas);


            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setNim(jo_inside.getString("NIM"));
                mahasiswa.setName(jo_inside.getString("Nama"));


                //Add your values in your `ArrayList` as below:
                locList.add(mahasiswa);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return locList;
    }
}
