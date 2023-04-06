def stepen(a,b):
    if b == 0:
        return 1
    else:
        return a * stepen(a, b-1)
    
print(stepen((int(input('введите число '))),int(input('введите степень '))))
        


