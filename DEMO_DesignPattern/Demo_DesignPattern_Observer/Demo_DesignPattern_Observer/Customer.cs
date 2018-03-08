using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern_Observer
{
    class Customer : Observer
    {
        private string name;
        public string Name
        {
            get { return name; }
            set { name = value; }
        }
        private string sdt;
        public string Sdt
        {
            get { return sdt; }
            set { sdt = value; }
        }
        public Customer(string name, string sdt)
        {
            this.name = name;
            this.sdt = sdt;
        }
        public override void ObserverInfo(string info)
        {
            MessageBox.Show("\nThong bao toi khach hang co ten: " + Name + "  \nSĐT là: " + Sdt + " \nThong tin san pham: " + info);
        }
        
    }
}
