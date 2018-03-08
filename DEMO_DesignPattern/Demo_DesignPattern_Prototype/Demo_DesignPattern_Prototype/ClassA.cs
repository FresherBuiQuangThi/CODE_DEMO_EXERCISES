using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo_DesignPattern_Prototype
{
    class ClassA : MyClass,ICloneable
    {
        private string info;

        public string Info
        {
            get { return info; }
            set { info = value; }
        }
        // funtion Clone(): Help create a new entity of the existing entity
        public object Clone()
        {
            ClassA nwClass = base.Clone() as ClassA; //base: Takes all properties of the base class (MyClass) bring down ClassA.
            nwClass.Info = this.info;

            return nwClass;
        }

        public override string ToString()  // Override again ToString funtion.
        {
            return base.ToString() +  " | " + this.info;
        }
    }
}
