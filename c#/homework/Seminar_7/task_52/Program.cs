static void Main(string[] args)
{
    int[,] array = new int[3, 4] { { 1, 4, 7, 2 }, { 5, 9, 2, 3 }, { 8, 4, 2, 4 } };
    for (int j = 0; j < array.GetLength(1); j++)
    {
        double average = GetColumnAverage(array, j);
        Console.WriteLine($"Среднее арифметическое элементов в столбце {j + 1}: {average}");
    }
}

static double GetColumnAverage(int[,] array, int column)
{
    double sum = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        sum += array[i, column];
    }
    return sum / array.GetLength(0);
}

Main(new string[] { });