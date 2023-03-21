n = [1,2,3,4,5]
k = 3  
for i in range(k):
    o = n.pop(-1)
    n.insert(0,o)
print (n)