// See https://aka.ms/new-console-template for more information
Console.WriteLine("Введите число");
int a = Convert.ToInt32(Console.ReadLine());

{
    if (a % 2 == 0)
        Console.WriteLine("Чётное!");
    else
        Console.WriteLine("Нечётное!");
}

