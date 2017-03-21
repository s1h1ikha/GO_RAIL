/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gorail;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author dell
 */
public class RetStaCode {
     public String stationcode(String name){
       name = name.toUpperCase();
       sQuery obj=new sQuery();
       String s="http://api.railwayapi.com/suggest_station/name/"+name+"/apikey/zxnpmy9q/";
       String resp=obj.getQuestionsUsingUnirest(s);
       JSONObject myjson;
        try 
        {
            myjson = new JSONObject(resp);
            JSONArray jarr = myjson.getJSONArray("station");
            int l = jarr.length();
                for(int i=0;i<l;i++){
                    if(name.equals(jarr.getJSONObject(i).getString("fullname") ) )
                         return jarr.getJSONObject(i).getString("code");
                }
        }
        catch (JSONException e) {
           JOptionPane.showMessageDialog( null , e);
           return null;
        }
         return null;
    } 
}
