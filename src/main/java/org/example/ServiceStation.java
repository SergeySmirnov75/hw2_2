package org.example;

public class ServiceStation {
    public void check(Car car)
    {
        if (car != null)
        {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++)
            {
                //car.updateTyre();
                Transport.updateTyre();
            }
            car.checkEngine();
        }
    }
        //else if (truck != null)
        public void check(Truck truck)
        {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++)
            {
                //truck.updateTyre();
                Transport.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
        //else if (bicycle != null)
        public void check(Bicycle bicycle)
        {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++)
            {
                //bicycle.updateTyre();
                Transport.updateTyre();
            }
        }
}
