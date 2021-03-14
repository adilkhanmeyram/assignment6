package com.company.task3.builders;

import com.company.task3.house.House;

public class SimpleHouseBuilder implements Builder {
    private House house;

    public SimpleHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildBasement()
    {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure()
    {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildInterior()
    {
        house.setInterior("Fire Wood");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public House getHouse()
    {
        return this.house;
    }
}
