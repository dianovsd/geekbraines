static void Main(string[] args)
{
    Console.WriteLine("Введите размер исходного массива строк:");
    int size = int.Parse(Console.ReadLine());
    string[] array = new string[size];
    Console.WriteLine("Введите элементы исходного массива строк:");
    for (int i = 0; i < size; i++)
    {
        array[i] = Console.ReadLine();
    }
}

static string[] FilterArray(string[] array, int length)
{

    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= length)
        {
            count++;
        }
    }
    string[] newArray = new string[count];
    int index = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i].Length <= length)
        {
            newArray[index] = array[i];
            index++;
        }
    }
    return newArray;
}
