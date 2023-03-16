n = int(input("введите колличество монеток "))
count_zero = 0
count_one = 0
for i in range(n):
    x = int(input("введите 0 если решка, или 1 если орел " ))
    if x == 0:
        count_zero += 1
    else:
        count_one += 1
if count_one > count_zero:
    print(count_zero)
else:
    print(count_one)