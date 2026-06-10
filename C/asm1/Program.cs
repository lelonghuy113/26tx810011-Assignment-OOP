using System;

namespace PhanSoApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;

            Console.WriteLine("Bai tap 1:");
            PhanSo psA = new PhanSo(2, 4);
            PhanSo psB = new PhanSo(1, -3);

            Console.WriteLine($"new PhanSo(2, 4) = {psA}");
            Console.WriteLine($"new PhanSo(1, -3) = {psB}");

            try
            {
                PhanSo psLoi = new PhanSo(1, 0);
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine($"new PhanSo(1, 0) bi loi: {ex.Message}");
            }

            Console.WriteLine();
            Console.WriteLine("Bai tap 2:");
            PhanSo ps1 = new PhanSo(1, 2);
            PhanSo ps2 = new PhanSo(1, 3);

            Console.WriteLine($"ps1 = {ps1}");
            Console.WriteLine($"ps2 = {ps2}");
            Console.WriteLine($"ps1 + ps2 = {ps1 + ps2}");
            Console.WriteLine($"ps1 - ps2 = {ps1 - ps2}");
            Console.WriteLine($"ps1 * ps2 = {ps1 * ps2}");
            Console.WriteLine($"ps1 / ps2 = {ps1 / ps2}");
            Console.WriteLine($"ps1 + 2 = {ps1 + 2}");
            Console.WriteLine($"2 + ps1 = {2 + ps1}");

            try
            {
                PhanSo ps0 = new PhanSo(0, 5);
                Console.WriteLine(ps1 / ps0);
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine($"Loi chia cho phan so 0: {ex.Message}");
            }

            Console.WriteLine();
            Console.WriteLine("Bai tap 3:");
            PhanSo ps3 = new PhanSo(1, 2);
            PhanSo ps4 = new PhanSo(2, 4);
            PhanSo ps5 = new PhanSo(1, 3);

            Console.WriteLine($"ps3 = {ps3}");
            Console.WriteLine($"ps4 = {ps4}");
            Console.WriteLine($"ps5 = {ps5}");

            Console.WriteLine($"ps3 == ps4: {ps3 == ps4}");
            Console.WriteLine($"ps3 != ps5: {ps3 != ps5}");
            Console.WriteLine($"ps5 < ps3: {ps5 < ps3}");
            Console.WriteLine($"ps3 > ps5: {ps3 > ps5}");

            Console.WriteLine();
            Console.WriteLine("ps3 bang ps4 vi 2/4 sau khi tao doi tuong da duoc rut gon thanh 1/2.");
        }
    }
}
