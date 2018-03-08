using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern_Observer
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Product product = new Product("Itel core I7, 16GB RAM");

            Customer ctm1 = new Customer("Bùi Quang Thi", "01699725972");
            Customer ctm2 = new Customer("Bùi Quang Thiện","01693885551");

            product.Add_Customer(ctm1);
            product.Add_Customer(ctm2);

            product.ObserverInfo("");
        }
    }
}
