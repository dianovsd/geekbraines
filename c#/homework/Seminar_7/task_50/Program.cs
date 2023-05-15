int[,] array = new int[3, 3] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
Console.WriteLine("Введите номер строки:");
int row = int.Parse(Console.ReadLine()) - 1;
Console.WriteLine("Введите номер столбца:");
int column = int.Parse(Console.ReadLine()) - 1;
if (row >= array.GetLength(0) || column >= array.GetLength(1))
{
    Console.WriteLine("Такого элемента нет");
}
else
{
    Console.WriteLine($"Значение элемента: {array[row, column]}");
}