def summa(a,b):
    if b == 0:
        return a
    elif a == 0:
        return b
    else:
        return summa(a+1, b-1)
    
print(summa(int(input('введите число а ')), int(input('введите число б '))))

        
        
