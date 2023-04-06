l = [0,-1,5,2,3]
n = 0

for i in range(1, len(l)):
    if l[i] > l[i-1]:
        n += 1
print (n)