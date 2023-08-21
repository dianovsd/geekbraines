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