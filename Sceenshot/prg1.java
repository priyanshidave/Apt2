using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Calculate_area
    {
        public delegate void area(float a, float b);

        static void Main(string[] args)
        {
            float Base, Height, length, width;
            Calculate_area A = new Calculate_area();
            area R = new area(A.rec);
            area T = new area(A.tri);
            Console.WriteLine("Triangle details\n");
            Console.WriteLine("Enter Base : ");
            Base = float.Parse(Console.ReadLine());
            Console.WriteLine("Enter Height : ");
            Height = float.Parse(Console.ReadLine());
            T(Base, Height);
            Console.WriteLine("\nRectangle details\n");
            Console.WriteLine("Enter length : ");
            length = float.Parse(Console.ReadLine());
            Console.WriteLine("Enter width : ");
            width = float.Parse(Console.ReadLine());
            R(length , width);

            Console.ReadKey();
        }
        public void tri(float a, float b)
        {
            float  ans;
            ans = (a * b) / 2;
            Console.WriteLine("Area of Rectangle is : "+ans);

        }
        public void rec(float a, float b)
        {
            float ans;
            ans = a * b;
            Console.WriteLine("Area of Triangle is : " + ans);

        }

    }
}
