int Prompt(string message)
{
    Console.Write(message);
    string value = Console.ReadLine();
    int result = Convert.ToInt32(value);
    return result;
}

int n = Prompt("Введите число N ");

for (int i = 1; i <= n; i++)
    Console.WriteLine($"{i} | {i*i*i}");


