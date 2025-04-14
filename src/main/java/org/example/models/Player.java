package org.example.models;

import java.util.List;

public class Player {
    public enum PlayerClass {
        DRUID,
        HUNTER,
        MAGE,
        PALADIN,
        PRIEST,
        ROGUE,
        SHAMAN,
        WARLOCK,
        WARRIOR
    }

    public enum Role {
        MELEE_DPS,
        RANGED_DPS,
        TANK,
        HEALER,
        DPS_OT
    }

    // ATTRIBUTES
    String name;
    PlayerClass playerClass;
    Role role;
    int points;
    List<Item> itemHistory;

    public Player() {}

    public Player(String name, PlayerClass playerClass, Role role, int points) {
        try {
            setName(name);
            setPlayerClass(playerClass);
            setRole(role);
            setPoints(points);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty!");
        }
        else {
            this.name = name;
        }
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        if(playerClass == null) {
            throw new IllegalArgumentException("You must enter a class!");
        }
        else {
            this.playerClass = playerClass;
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        if(role == null) {
            throw new IllegalArgumentException("You must enter a valid role!");
        }
        else {
            this.role = role;
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Item> getItemHistory() {
        return itemHistory;
    }

    public void setItemHistory(List<Item> itemHistory) {
        this.itemHistory = itemHistory;
    }
}
