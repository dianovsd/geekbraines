n = int(input('введите колличество элементов первого списка '))
a = []
for i in range(n):
    a.append(int(input()))

m = int(input('введите колличество элементов второго списка '))
b = []
for i in range(m):
    b.append(int(input()))

result = []

for i in a:
    if i in b and i not in result:
        result.append(i)

for i in sorted(result):
    print(i, end=' ')