package org.example;

public class Transport implements TransportUpdate
{
    @Override
    public void updateTyre()
    {
        System.out.println("Меняем покрышку");
    }
}
