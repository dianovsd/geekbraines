
class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Введите значение M: ");
        int M = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Введите значение N: ");
        int N = Convert.ToInt32(Console.ReadLine());
        int sum = SumNumbers(M, N);
        Console.WriteLine("Сумма натуральных чисел от {0} до {1} равна {2}", M, N, sum);
    }

    static int SumNumbers(int M, int N)
    {
        if (M <= N)
            return M + SumNumbers(M + 1, N);
        else
            return 0;
    }
}

