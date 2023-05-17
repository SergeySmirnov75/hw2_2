public class Truck extends Transport
{
    public void updateTyre()
    {
        System.out.println("Меняем покрышку грузовику");
    }

    public void checkEngine()
    {
        System.out.println("Проверяем двигатель грузовику");
    }

    public void checkTrailer()
    {
        System.out.println("Проверяем прицеп грузовика");
    }

    public Truck(String modelName, int wheelsCount)
    {
        super(modelName, wheelsCount);
    }
}
