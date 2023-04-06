my_str = input('a').split()
dict = {}
for i in my_str:
    if i not in dict:
        dict[i] = 0
        print (i, end=' ')
    elif i in dict:
         dict[i] += 1
         print(f'{i}_{dict[i]}', end=' ')