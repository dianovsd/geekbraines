n = int(input('введите колличество символов в массиве '))
array = [i for i in range(1,n+1)]
print (array)

c = 0
x = int(input('введите число к которому нужно найти ближайщее '))
for i in array:
    if i - x == 1:
        print (i)
    elif x - i == 1:
        print (i)
    
      