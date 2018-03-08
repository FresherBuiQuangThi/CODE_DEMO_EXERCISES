using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo_DesignPattern_Prototype
{
    class ClassB : MyClass, ICloneable
    {
        private string adddress;

        public string Adddress
        {
            get { return adddress; }
            set { adddress = value; }
        }
        // funtion Clone(): Help create a new entity of the existing entity
        public object Clone()
        {
            ClassB nwClass = base.Clone() as ClassB;  //base: Takes all properties of the base class (MyClass) bring down ClassB.
            nwClass.Adddress = this.adddress;

            return nwClass;
        }

        public override string ToString()  // Override again ToString funtion.
        {
            return base.ToString() + " | " + this.adddress;
        }
    }
}
