using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Singleton.Instance.Demo();//Uses all functions of Singleton class, through only one instance of Instance.
            Singleton.Instance.printString(Singleton.Instance.myName);//Uses all functions of Singleton class, through only one instance of Instance.
        }
    }
}
