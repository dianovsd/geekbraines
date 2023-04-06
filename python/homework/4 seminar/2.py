n = int(input())
a = list()
for i in range(n):
    x = int(input())
    a.append(x)

a_count = list()
for i in range(len(a)- 1):
    a_count.append(a[i - 1] + a[i] + a[i+1])
a_count.append(a[-2] + a[-1] + a[0])
print(max(a_count))