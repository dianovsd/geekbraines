Console.WriteLine("Введите три числа");
int a = Convert.ToInt32(Console.ReadLine());
int b = Convert.ToInt32(Console.ReadLine());
int c = Convert.ToInt32(Console.ReadLine());
int max = 0;
{
    if (a > max)
        max = a;
    if (b > max)
        max = b;
    if (c > max)
        max = c;
    else;
}

Console.WriteLine($"Максимальное число {max}");
