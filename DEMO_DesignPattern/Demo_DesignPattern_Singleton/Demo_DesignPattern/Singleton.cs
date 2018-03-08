using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern
{
    // Exercise Demo Singleton of Creational Pattern Group 
    // Idea: + The implementation of the Singleton model must: Ensure that only one instance of the Singleton class exists; 
    //       + Provide public access to that case. 
    //       + Provides a static method that returns a reference to the object.

    class Singleton
    {
        public string myName = "Fresher Bui Quang Thi";
        private static volatile Singleton instance; //Create instance variable of return Singleton type, "volatile" helps automatically handle collisions
        static object key = new object();
        public static Singleton Instance
        {
            get
            {
                if (instance == null)
                {
                    lock (key) // Lock "object key" back to make sure that at one time only one task is running
                    {
                        instance = new Singleton();
                    }
                }
                return instance;
            }
        }
        private Singleton() //Initialize function Singleton
        { }
        public void Demo()
        {
            MessageBox.Show("Demo Design Pattern!");
        }
        public void printString(string s)
        {
            MessageBox.Show(s);
        }
    }
}
