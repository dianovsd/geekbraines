
// Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

// 6 -> да
// 7 -> да
// 1 -> нет

int Prompt(string message)
{
    Console.Write(message);
    string value = Console.ReadLine();
    int result = Convert.ToInt32(value);
    return result;
}

string Weekend(int n)
{
    if (n > 0 && n < 6)
        return "Иди работать!";
    else if (n > 5 && n < 8)
        return "Иди за пивом!";
    else if (n > 7)
        return "Это не день!";
    else
        return "";
}

int a = Prompt("Какой номер дня? ");
Console.WriteLine(Weekend(a));