list_1 = [4, 3, -5, 45, 1, -67, 23, 4, 23, -56, 34 , 5, 2, -6, 3, 5]
min = int(input('input min '))
max = int(input('input max '))

for i in range(len(list_1)):
    if min <= list_1[i] <= max:
        print (i)