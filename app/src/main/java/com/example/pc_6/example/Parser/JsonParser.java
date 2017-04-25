package com.example.pc_6.example.Parser;


import com.example.pc_6.example.Models.Post;
import com.example.pc_6.example.Models.Usuarios;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static List<Usuarios> getData(String content) throws Exception {
        JSONArray myArray = new JSONArray(content);
        List<Usuarios> myPost = new ArrayList<>();
        for (int i = 0; i < myArray.length(); i++) {
            JSONObject item = myArray.getJSONObject(i);
            Usuarios post = new Usuarios();
            post.setId(item.getInt("id"));
            post.setName(item.getString("name"));
            post.setUsername(item.getString("username"));
            post.setEmail(item.getString("email"));

            myPost.add(post);
        }
        return myPost;
    }
}
