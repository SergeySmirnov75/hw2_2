public class Bicycle extends Transport
{

    public Bicycle(String modelName, int wheelsCount)
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
        }
    }

}
