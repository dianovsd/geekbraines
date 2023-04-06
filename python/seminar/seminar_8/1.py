file_path = 'text.txt'

def read_app():
    with open(file_path,'a') as f:
        print(f.read())

def append_app():
    with open(file_path, 'a') as f:
        f.write('\n' +input())

def find_app():
    temp = input('Введите слово для поиска: ')
    with open(file_path, 'r') as f:
        for line in f:
            if temp in line:
                print (line.strip())

def rewrite_app():
     with open(file_path, 'w') as f:
         