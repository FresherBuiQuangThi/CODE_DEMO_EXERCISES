using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern_Prototype
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MyClass myclass = new MyClass();
            myclass.Id = "1";
            myclass.Name = "1";
            MessageBox.Show(myclass.ToString());

            ClassA classA = new ClassA();
            classA.Id = "2";
            classA.Name = "2";
            classA.Info = "2";
            MessageBox.Show(classA.ToString());

            ClassB classB = new ClassB();
            classB.Id = "3";
            classB.Name = "3";
            classB.Adddress = "3";
            MessageBox.Show(classB.ToString());
        }
    }
}
