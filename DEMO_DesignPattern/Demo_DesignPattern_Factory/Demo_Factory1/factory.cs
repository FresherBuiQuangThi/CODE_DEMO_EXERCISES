using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo_Factory1
{
    public class CarFactory
    {
        public void viewCar(String carType)
        {
            Car car;
            if (carType == "Honda")
            {
                car = new Honda();
                car.view();
            }
            else if (carType == "Nexus")
            {
                car = new Nexus();
                car.view();
            }
            else if (carType == "Toyota")
            {
                car = new Toyota();
                car.view();
            }
        }
    }
}
