package com.company.task3.builders;

import com.company.task3.house.House;

public interface Builder {
    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}
