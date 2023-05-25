class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Введите значение N: ");
        int N = Convert.ToInt32(Console.ReadLine());
        PrintNumbers(N);
    }

    static void PrintNumbers(int N)
    {
        if (N > 0)
        {
            Console.WriteLine(N);
            PrintNumbers(N - 1);
        }
    }
}
