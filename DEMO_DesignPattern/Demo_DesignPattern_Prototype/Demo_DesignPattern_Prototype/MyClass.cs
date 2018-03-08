using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo_DesignPattern_Prototype
{
    class MyClass : ICloneable // ICloneable: used to copy properties and bring properties down the inheritance class
    {
        private string id;

        public string Id
        {
            get { return id; }
            set { id = value; }
        }

        private string name;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        // funtion Clone(): Help create a new entity of the existing entity
        public object Clone()
        {
            return new MyClass() { Name = this.name, Id = this.id};
        }

        public override string ToString() // Override again ToString funtion.
        {
            return "ID:  " + this.id + " | " + this.name;
        }
    }
}
