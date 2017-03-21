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
import org.apache.http.HttpHost;

//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.params.HttpConnectionParams;
//import org.apache.http.params.HttpParams;
//import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author dell
 */
public class sQuery {
      public String getQuestionsUsingUnirest(String url)  {
        try{
        String s;
        Unirest.setProxy(new HttpHost("172.31.1.3", 8080));
       
        HttpResponse<JsonNode> response = Unirest.get(url).asJson();
        //System.out.println(response.getBody().getObject().toString(2));
       
        s = response.getBody().getObject().toString(2) ;
        return s;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
