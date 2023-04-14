// Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

int Promt(string message)

{
    Console.Write(message);
    string value = Console.ReadLine();
    int result = Convert.ToInt32(value);
    return result;
}

int Find(int num)

{
    while (num > 999)
    { num /= 10; }
    return num % 10;
}

int number = Promt("Введите число ");
if (number < 100)
{
    Console.WriteLine("Третьей цифры нет");
}
else
{
    Console.WriteLine(Find(number));
}
