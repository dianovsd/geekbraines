max_len = 0
temp_count = 0
num_days = int(input('Num days--> '))
for i in range(num_days):
    temp = int(input(f'Day_{i}--> '))
    if temp > 0:
        temp_count += 1
    else:
        temp_count = 0

    if temp_count > max_len:
        max_len = temp_count

print(max_len)