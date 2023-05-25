class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Введите значение m: ");
        int m = Convert.ToInt32(Console.ReadLine());
        if (m < 0)
        {
            Console.WriteLine("Ошибка: m не может быть отрицательным");
            return;
        }
        Console.WriteLine("Введите значение n: ");
        int n = Convert.ToInt32(Console.ReadLine());
        if (n < 0)
        {
            Console.WriteLine("Ошибка: n не может быть отрицательным");
            return;
        }
        int result = Ackermann(m, n);
        Console.WriteLine("Значение функции Аккермана для m = {0} и n = {1} равно {2}", m, n, result);
    }

    static int Ackermann(int m, int n)
    {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return Ackermann(m - 1, 1);
        else
            return Ackermann(m - 1, Ackermann(m, n - 1));
    }
}

