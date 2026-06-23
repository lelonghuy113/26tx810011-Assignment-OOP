using System;

namespace OperatorApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("===== BAI 1: VECTOR2D =====");

            Vector2D v1 = new Vector2D(3, 4);
            Vector2D v2 = new Vector2D(1, 2);

            Console.WriteLine("v1 = " + v1);
            Console.WriteLine("v2 = " + v2);
            Console.WriteLine("v1 + v2 = " + (v1 + v2));
            Console.WriteLine("v1 - v2 = " + (v1 - v2));
            Console.WriteLine("v1 * 2 = " + (v1 * 2));
            Console.WriteLine("3 * v2 = " + (3 * v2));
            Console.WriteLine("-v1 = " + (-v1));
            Console.WriteLine("|v1| = " + v1.DoDai.ToString("F4"));

            Console.WriteLine("v1 == v2: " + (v1 == v2));
            Console.WriteLine("v1 != v2: " + (v1 != v2));
            Console.WriteLine("v1 * v2 = " + (v1 * v2));

            Vector2D v3 = (3.0, 4.0);
            Console.WriteLine("v3 = " + v3);
            Console.WriteLine("v1 == v3: " + (v1 == v3));

            Console.WriteLine();
            Console.WriteLine("===== BAI 2: MONEY =====");

            Money luong = new Money(15000000, "VND");
            Money thuong = new Money(3000000, "VND");
            Money lamThemGio = luong * 1.5m;

            Console.WriteLine("Luong co ban: " + luong);
            Console.WriteLine("Thuong: " + thuong);
            Console.WriteLine("Luong lam them: " + lamThemGio);
            Console.WriteLine("Tong thu nhap: " + (luong + thuong));
            Console.WriteLine("Luong > thuong: " + (luong > thuong));

            Money hoaDon = new Money(1200000, "VND");
            Money moiNguoi = hoaDon / 4;

            Console.WriteLine("Hoa don: " + hoaDon);
            Console.WriteLine("Moi nguoi tra: " + moiNguoi);

            Money usd100 = new Money(100, "USD");
            Money doiSangVnd = Money.QuyDoi(usd100, "VND", 25500);

            Console.WriteLine("100 USD doi sang VND: " + doiSangVnd);

            try
            {
                Money usd = new Money(100, "USD");
                Money tong = luong + usd;
                Console.WriteLine(tong);
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine("Loi: " + ex.Message);
            }
        }
    }
}