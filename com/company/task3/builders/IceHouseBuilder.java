package com.company.task3.builders;

import com.company.task3.house.House;

public class IceHouseBuilder implements Builder {
    private House house;

    public IceHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildBasement()
    {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure()
    {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildInterior()
    {
        house.setInterior("Ice Carvings");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Ice Dome");
    }

    @Override
    public House getHouse()
    {
        return this.house;
    }
}
