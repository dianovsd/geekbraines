# mas = []
# n = int(input('input the quantity of items '))
# m = 0

# for i in range(n):
#     mas.append(int(input('input item ')))

# print (mas)

###  Или вот так (создание массива)

l1 = [int(input(f"Введите элемент массива {i + 1}: ")) for i in range(int(input("Введите длину массива: ")))]

# i, n, count = 1, len(l1) - 1, 0
# while i<n:
#     if l1[i-1]<l1[i]>l1[i+1]:
#         count += 1
#     i+=1

i, count = 1, 0

for i in range(i,len(l1) - 1):
    if l1[i-1]<l1[i]>l1[i+1]:
        count += 1

print(count)


