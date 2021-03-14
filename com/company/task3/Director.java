package com.company.task3;

import com.company.task3.builders.Builder;
import com.company.task3.house.House;

public class Director {
    private Builder builder;

    public Director(Builder builder)
    {
        this.builder = builder;
    }

    public House getHouse()
    {
        return this.builder.getHouse();
    }

    public void constructHouse()
    {
        this.builder.buildBasement();
        this.builder.buildStructure();
        this.builder.buildRoof();
        this.builder.buildInterior();
    }
}
