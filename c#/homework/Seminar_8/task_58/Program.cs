using System;

static void Main()
{
    int[,] matrix1 = new int[,] { { 2, 4 }, { 3, 2 } };
    int[,] matrix2 = new int[,] { { 3, 4 }, { 3, 3 } };
    int[,] result = new int[2, 2];

    for (int i = 0; i < matrix1.GetLength(0); i++)
    {
        for (int j = 0; j < matrix2.GetLength(1); j++)
        {
            for (int k = 0; k < matrix1.GetLength(1); k++)
            {
                result[i, j] += matrix1[i, k] * matrix2[k, j];
            }
        }
    }

    Console.WriteLine("Результирующая матрица:");
    Console.WriteLine(result[0, 0] + " " + result[0, 1]);
    Console.WriteLine(result[1, 0] + " " + result[1, 1]);
}


Main();