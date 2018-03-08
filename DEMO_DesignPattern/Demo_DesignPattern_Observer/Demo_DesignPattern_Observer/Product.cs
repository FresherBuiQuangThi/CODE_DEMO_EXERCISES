using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Demo_DesignPattern_Observer
{
    class Product: Observer
    {
        private string nameSP;
        public string NameSP
        {
            get { return nameSP; }
            set { nameSP = value; }
        }
        private List<Customer> lst_customer = new List<Customer>();
        public override void ObserverInfo(string info)
        {          
            foreach(Customer item in lst_customer)
            {
                if(item != null)
                {
                    item.ObserverInfo(nameSP);
                }
            }
        }
        public Product(string nameSP)
        {
            this.nameSP = nameSP;
        }    
        public void Add_Customer(Customer customer)
        {
            if (customer != null)
                lst_customer.Add(customer);
        }
        public void Remove_Customer(Customer customer)
        {
            if (customer != null)
                lst_customer.Remove(customer);
        }
    }
}
