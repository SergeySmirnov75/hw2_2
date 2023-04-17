package org.example;

public class ServiceStation
{
    public void check(Car car, Bicycle bicycle, Truck truck)
    {
        if (car != null)
        {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++)
            {
<<<<<<< HEAD
                car.updateTyre();
=======
                Transport.updateTyre();
>>>>>>> 7168f05 (Initial commit)
            }
            car.checkEngine();
        } else if (truck != null)
        {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++)
            {
<<<<<<< HEAD
                truck.updateTyre();
=======
                Transport.updateTyre();
>>>>>>> 7168f05 (Initial commit)
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null)
        {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++)
            {
<<<<<<< HEAD
                bicycle.updateTyre();
=======
                Transport.updateTyre();
>>>>>>> 7168f05 (Initial commit)
            }
        }
    }
}
