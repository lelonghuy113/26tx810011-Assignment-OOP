using System;

namespace PhanSoApp
{
    public class PhanSo
    {
        public int TuSo { get; private set; }
        public int MauSo { get; private set; }

        public PhanSo(int tuSo, int mauSo)
        {
            if (mauSo == 0)
                throw new ArgumentException("Mau so khong duoc bang 0!");
            
            if (mauSo < 0)
            {
                tuSo = -tuSo;
                mauSo = -mauSo;
            }

            int ucln = UCLN(Math.Abs(tuSo), Math.Abs(mauSo));

            TuSo = tuSo / ucln;
            MauSo = mauSo / ucln;
        }

        private static int UCLN(int a, int b)
        {
            while (b != 0)
            {
                int t = b;
                b = a % b;
                a = t;
            }

            return a == 0 ? 1 : a;
        }

        public PhanSo RutGon()
        {
            return new PhanSo(TuSo, MauSo);
        }

        public override string ToString()
        {
            if (MauSo == 1)
                return TuSo.ToString();

            return $"{TuSo}/{MauSo}";
        }

        // Bai tap 2: Toan tu so hoc

        public static PhanSo operator +(PhanSo a, PhanSo b)
        {
            return new PhanSo(
                a.TuSo * b.MauSo + b.TuSo * a.MauSo,
                a.MauSo * b.MauSo
            );
        }

        public static PhanSo operator -(PhanSo a, PhanSo b)
        {
            return new PhanSo(
                a.TuSo * b.MauSo - b.TuSo * a.MauSo,
                a.MauSo * b.MauSo
            );
        }

        public static PhanSo operator *(PhanSo a, PhanSo b)
        {
            return new PhanSo(
                a.TuSo * b.TuSo,
                a.MauSo * b.MauSo
            );
        }

        public static PhanSo operator /(PhanSo a, PhanSo b)
        {
            if (b.TuSo == 0)
                throw new DivideByZeroException("Khong the chia cho phan so bang 0!");

            return new PhanSo(
                a.TuSo * b.MauSo,
                a.MauSo * b.TuSo
            );
        }

        public static PhanSo operator +(PhanSo a, int b)
        {
            return a + new PhanSo(b, 1);
        }

        public static PhanSo operator +(int a, PhanSo b)
        {
            return new PhanSo(a, 1) + b;
        }

        // Bai tap 3: Toan tu so sanh

        public static bool operator ==(PhanSo a, PhanSo b)
        {
            if (ReferenceEquals(a, b)) return true;
            if (a is null || b is null) return false;

            return a.TuSo == b.TuSo && a.MauSo == b.MauSo;
        }

        public static bool operator !=(PhanSo a, PhanSo b)
        {
            return !(a == b);
        }

        public static bool operator <(PhanSo a, PhanSo b)
        {
            return a.TuSo * b.MauSo < b.TuSo * a.MauSo;
        }

        public static bool operator >(PhanSo a, PhanSo b)
        {
            return a.TuSo * b.MauSo > b.TuSo * a.MauSo;
        }

        public override bool Equals(object? obj)
        {
            if (obj is not PhanSo other)
                return false;

            return this == other;
        }

        public override int GetHashCode()
        {
            return HashCode.Combine(TuSo, MauSo);
        }
    }
}
