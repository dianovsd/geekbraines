# def create_list(n):
#     list = []
#     for i in range(n):
#         list.append(int(input('введите элемент ')))
#     return list

# a = int(input('введите колличество элементов 1 массива '))
# b = int(input('введите колличество элементов 2 массива '))

# list1 = create_list(a)
# list2 = create_list(b)

# for i in list1:
#     if i not in list2:
#         print (i, end = "")
    

def remove_el(lst1, set2):
    for i in set2:
        while i in lst1:
            lst1.remove(i)
    return(lst1)

l1 = [int(input(f"Введите элемент массива {i + 1}: ")) for i in range(int(input("Введите длину массива: ")))]
l2 = set([int(input(f"Введите элемент массива {i + 1}: ")) for i in range(int(input("Введите длину массива: ")))])

print(l1)
print(l2)
print(*remove_el(l1, l2))   