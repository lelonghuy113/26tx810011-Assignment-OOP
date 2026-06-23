using System;

namespace OperatorApp
{
    public class Vector2D
    {
        public double X { get; private set; }
        public double Y { get; private set; }

        public Vector2D()
        {
            X = 0;
            Y = 0;
        }

        public Vector2D(double x, double y)
        {
            X = x;
            Y = y;
        }

        public double DoDai
        {
            get
            {
                return Math.Sqrt(X * X + Y * Y);
            }
        }

        public static Vector2D operator +(Vector2D a, Vector2D b)
        {
            return new Vector2D(a.X + b.X, a.Y + b.Y);
        }

        public static Vector2D operator -(Vector2D a, Vector2D b)
        {
            return new Vector2D(a.X - b.X, a.Y - b.Y);
        }

        public static Vector2D operator *(Vector2D v, double k)
        {
            return new Vector2D(v.X * k, v.Y * k);
        }

        public static Vector2D operator *(double k, Vector2D v)
        {
            return new Vector2D(v.X * k, v.Y * k);
        }

        public static Vector2D operator -(Vector2D v)
        {
            return new Vector2D(-v.X, -v.Y);
        }

        public static double operator *(Vector2D a, Vector2D b)
        {
            return a.X * b.X + a.Y * b.Y;
        }

        public static bool operator ==(Vector2D a, Vector2D b)
        {
            if ((object)a == null || (object)b == null)
                return false;

            return a.X == b.X && a.Y == b.Y;
        }

        public static bool operator !=(Vector2D a, Vector2D b)
        {
            return !(a == b);
        }

        public static implicit operator Vector2D((double x, double y) value)
        {
            return new Vector2D(value.x, value.y);
        }

        public override bool Equals(object obj)
        {
            Vector2D v = obj as Vector2D;

            if (v == null)
                return false;

            return this == v;
        }

        public override int GetHashCode()
        {
            return X.GetHashCode() + Y.GetHashCode();
        }

        public override string ToString()
        {
            return "(" + X.ToString("F2") + ", " + Y.ToString("F2") + ")";
        }
    }
}