package com.spring.springtest;

import java.util.LinkedList;
import java.util.List;

public class Player {

    private List<String> players = new LinkedList<>();

    public Player() {
        players.add("Messi");
        players.add("CR7");
        players.add("Mo Saleh");
        players.add("Trecka");
    }

    public String getName(String name){
        for (int i=0; i<players.size();i++){
            if(players.get(i).equals(name)){
                return players.get(i);
            }
        }
        return null;
    }

}
