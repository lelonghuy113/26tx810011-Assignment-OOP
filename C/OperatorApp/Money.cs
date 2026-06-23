using System;

namespace OperatorApp
{
    public class Money
    {
        public decimal Amount { get; private set; }
        public string Currency { get; private set; }

        public Money(decimal amount, string currency)
        {
            if (amount < 0)
                throw new ArgumentException("So tien khong duoc am");

            Amount = amount;
            Currency = currency.ToUpper();
        }

        private static void KiemTraCungDonVi(Money a, Money b)
        {
            if (a.Currency != b.Currency)
            {
                throw new InvalidOperationException(
                    "Khong the tinh toan giua " + a.Currency + " va " + b.Currency
                );
            }
        }

        public static Money operator +(Money a, Money b)
        {
            KiemTraCungDonVi(a, b);

            decimal tong = a.Amount + b.Amount;
            return new Money(tong, a.Currency);
        }

        public static Money operator -(Money a, Money b)
        {
            KiemTraCungDonVi(a, b);

            if (a.Amount < b.Amount)
                throw new InvalidOperationException("Ket qua khong duoc am");

            decimal hieu = a.Amount - b.Amount;
            return new Money(hieu, a.Currency);
        }

        public static Money operator *(Money m, decimal heSo)
        {
            if (heSo < 0)
                throw new ArgumentException("He so khong duoc am");

            return new Money(m.Amount * heSo, m.Currency);
        }

        public static Money operator *(decimal heSo, Money m)
        {
            return m * heSo;
        }

        public static bool operator >(Money a, Money b)
        {
            KiemTraCungDonVi(a, b);
            return a.Amount > b.Amount;
        }

        public static bool operator <(Money a, Money b)
        {
            KiemTraCungDonVi(a, b);
            return a.Amount < b.Amount;
        }

        public static bool operator ==(Money a, Money b)
        {
            if ((object)a == null || (object)b == null)
                return false;

            return a.Amount == b.Amount && a.Currency == b.Currency;
        }

        public static bool operator !=(Money a, Money b)
        {
            return !(a == b);
        }

        public static Money operator /(Money m, decimal n)
        {
            if (n <= 0)
                throw new ArgumentException("So chia phai lon hon 0");

            return new Money(m.Amount / n, m.Currency);
        }

        public static Money QuyDoi(Money nguon, string donViDich, decimal tyGia)
        {
            if (tyGia <= 0)
                throw new ArgumentException("Ty gia phai lon hon 0");

            return new Money(nguon.Amount * tyGia, donViDich);
        }

        public override bool Equals(object obj)
        {
            Money m = obj as Money;

            if (m == null)
                return false;

            return this == m;
        }

        public override int GetHashCode()
        {
            return Amount.GetHashCode() + Currency.GetHashCode();
        }

        public override string ToString()
        {
            return Amount.ToString("N0") + " " + Currency;
        }
    }
}