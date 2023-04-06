n = int(input('введите колличество символов в массиве '))
array = [i for i in range(1,n+1)]
print (array)

c = 0
x = int(input('введите число которое нужно найти '))
for i in array:
    if i == x:
        c += 1
print(f"Число {x} встречается в массиве {c} раз.")
     
