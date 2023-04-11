Console.WriteLine("Введите число");
int a = Convert.ToInt32(Console.ReadLine());
int count = 0;

while (count < a)
{
    count += 2;
    Console.WriteLine(count);
}