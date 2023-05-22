static void Main()
{
    int[,,] array = GenerateArray();
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0; k < 2; k++)
            {
                Console.Write($"{array[i, j, k]}({i},{j},{k}) ");
            }
            Console.WriteLine();
        }
    }
}

static int[,,] GenerateArray()
{
    int[,,] array = new int[2, 2, 2];
    Random random = new Random();
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0; k < 2; k++)
            {
                int number;
                bool isUnique;
                do
                {
                    number = random.Next(10, 100);
                    isUnique = true;
                    for (int x = 0; x < i; x++)
                    {
                        for (int y = 0; y < j; y++)
                        {
                            for (int z = 0; z < k; z++)
                            {
                                if (array[x, y, z] == number)
                                {
                                    isUnique = false;
                                    break;
                                }
                            }
                        }
                    }
                } while (!isUnique);
                array[i, j, k] = number;
            }
        }
    }
    return array;
}

Main();