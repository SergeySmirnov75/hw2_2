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
public class Transport extends Transport_superClass
{
    public String modelName;
    public int wheelsCount;

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
