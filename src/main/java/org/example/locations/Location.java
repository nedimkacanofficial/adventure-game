package org.example.locations;

import org.example.players.Player;

import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    private int id;
    protected Scanner input=new Scanner(System.in);
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location(Player player, String name, int id) {
        this.player = player;
        this.name = name;
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean onLocation();
}
