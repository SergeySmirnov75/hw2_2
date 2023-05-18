public class Truck extends Transport
{


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

    public void check()
    {
        if (this != null)
        {
            //System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++)
            {
                this.updateTyre();
            }
            this.checkEngine();
            this.checkTrailer();
        }
    }

}
