x = int(input('сумма дву чисел равна '))
y = int(input('произведение двух чисел равно '))

for i in range (x):
    for j in range (y):
        if x == i + j and y == i * j:
            print (i, j)
        