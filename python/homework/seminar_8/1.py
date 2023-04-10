file_path = 'phonebook.txt'

def read_app():
    with open(file_path,'r ') as f:
        print(f.read())

def append_app():
    with open(file_path, 'a') as f:
        f.write('\n' +input("введите новые ФИО и номер телефона "))

def find_app():
    temp = input('Кто вас интересует: ')
    with open(file_path, 'r') as f:
        for line in f:
            if temp.lower() in line.lower():
                return (line.strip())

def delete_app():
    with open(file_path,'r') as f:
        lines = f.readlines()
    text = find_app()
    with open(file_path,'w') as f:
        for line in lines:
            if line.strip() != text:
                f.write(line)

def change_app():
    delete_app()
    append_app()



import tkinter as tk
from tkinter import Text

root = tk.Tk()
root.title("Телефонная книга")

frame1 = tk.Frame(root)
frame1.pack(side=tk.TOP)

text = open('phonebook.txt', encoding='utf-8').readlines()
text = ''.join(text)
textline = Text(frame1)
textline.insert(1.0, text)
textline.pack(side=tk.LEFT)

button = tk.Button(frame1, 
                   text="Найти контакт", 
                   fg="red",
                   command=find_app)
button.pack(side=tk.LEFT)

button = tk.Button(frame1, 
                   text="Добавить контакт", 
                   fg="red",
                   command=append_app)
button.pack(side=tk.LEFT)

frame2 = tk.Frame(root)
frame2.pack(side=tk.BOTTOM)

button = tk.Button(frame2, 
                   text="Изменить контакт", 
                   fg="red",
                   command=change_app)
button.pack(side=tk.LEFT)

button = tk.Button(frame2, 
                   text="Удалить контакт", 
                   fg="red",
                   command=delete_app)
button.pack(side=tk.LEFT)

root.mainloop()