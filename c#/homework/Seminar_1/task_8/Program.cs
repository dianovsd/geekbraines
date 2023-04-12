Console.WriteLine("Введите число");
int a = Convert.ToInt32(Console.ReadLine());
int count = 0;

while (count < a-1)
{
    count += 2;
    Console.WriteLine(count);
}