package org.example;

/*
public class Transport implements TransportUpdate
{
    @Override
    public void updateTyre()
    {
        System.out.println("Меняем покрышку");
    }
*/
public class Transport
{
    private String modelName;
    private int wheelsCount;

    public static void updateTyre()
    {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() 
    {
        return modelName;
    }

    public void setModelName(String modelName) 
    {
        this.modelName = modelName;
    }

    public int getWheelsCount() 
    {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) 
    {
        this.wheelsCount = wheelsCount;
    }
}
