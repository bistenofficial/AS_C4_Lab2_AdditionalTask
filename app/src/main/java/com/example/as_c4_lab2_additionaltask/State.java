package com.example.as_c4_lab2_additionaltask;

import java.util.ArrayList;

public class State {

    private String name; // название
    private String capital;  // столица
    private int flagResource; // ресурс флага
    private String population; //полуляция

    public State(String name, String capital, int flag,String population)
    {
        this.name=name;
        this.capital=capital;
        this.flagResource=flag;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
    public void setPopulation(String population) {
        this.population = population;
    }
    public String getPopulation() {
        return this.population;
    }
    public static ArrayList<State> createContactsList() {
        ArrayList<State> states = new ArrayList<>();
        states.add(new State("Россия","Москва",R.drawable.ru,"Population:146 748 590"));
        states.add(new State("Австралия","Канбера",R.drawable.au,"Population: 25 726 900"));
        states.add(new State("Япония","Токио",R.drawable.jp,"Population:125 552 000"));
        states.add(new State("США","Вашингтон",R.drawable.us,"Population:332 278 200"));
        states.add(new State("Вьетнам","Ханой",R.drawable.vn,"Population:94 660 000"));
        return states;
    }
}

