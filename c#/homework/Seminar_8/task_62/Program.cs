static void Main()
{
    int[,] array = GenerateSpiralArray(4);
    PrintArray(array);
}

static int[,] GenerateSpiralArray(int size)
{
    int[,] array = new int[size, size];
    int value = 1;
    int minRow = 0;
    int maxRow = array.GetLength(0) - 1;
    int minCol = 0;
    int maxCol = array.GetLength(1) - 1;

    while (value <= array.Length)
    {
        for (int i = minCol; i <= maxCol; i++)
        {
            array[minRow, i] = value++;
        }

        for (int i = minRow + 1; i <= maxRow; i++)
        {
            array[i, maxCol] = value++;
        }

        for (int i = maxCol - 1; i >= minCol; i--)
        {
            array[maxRow, i] = value++;
        }

        for (int i = maxRow - 1; i >= minRow + 1; i--)
        {
            array[i, minCol] = value++;
        }

        minRow++;
        maxRow--;
        minCol++;
        maxCol--;
    }

    return array;
}

static void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]:00} ");
        }
        Console.WriteLine();
    }
}

Main();