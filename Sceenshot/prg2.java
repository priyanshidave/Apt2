using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Str_del
    {
        public delegate string Del1(string S);
    
        static void Main(string[] args)
        {
            string str ,CS ;
            Console.WriteLine("Enter string to concate : ");
            str = Console.ReadLine();
            Str_del obj1 = new Str_del();
            Del1 do1 = new Del1(obj1.concate_str);
            CS = do1(str);
            Console.WriteLine("Concated string : " + CS);
            Console.ReadKey();
        }
        public string concate_str(string S)
        {
            String Str = "Hello" ,  ans;
            ans = string.Concat(Str,S);
            return ans;
            

        }
       

    }
}
