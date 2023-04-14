// // Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1

int Poisk(int num)
{
    num = num / 10;
    num = num % 10;
    return num;
}
Console.WriteLine("Введите трёх-значное число");
int a = Convert.ToInt32(Console.ReadLine());
if (a < 100 | a > 1000)
    Console.WriteLine("это не трёхзначное число");
else
{
    int result = Poisk(a);
    Console.WriteLine($"второе цифра это {result}");
}