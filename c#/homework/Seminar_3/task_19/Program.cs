

int Prompt(string message)
{
    Console.Write(message);
    string value = Console.ReadLine();
    int result = Convert.ToInt32(value);
    return result;
}

int number = Prompt("Введите пятизначное число ");

if (number < 10000 | number > 99999)
    Console.WriteLine("это не пятизначное число");
else
{
    int[] digits = new int[number.ToString().Length];

    for (int i = 0; i < digits.Length; i++)
    {
        digits[i] = number % 10;
        number /= 10;
    }

    if (digits[0] == digits[4] || digits[1] == digits[3])
    Console.WriteLine("Это Палиндром"); 
    else
    Console.WriteLine("Это не Палиндром"); 

}