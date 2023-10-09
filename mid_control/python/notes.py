import json
import os
import sys
from datetime import datetime

def save_notes(notes):
    with open('notes.json', 'w') as f:
        json.dump(notes, f)

def read_notes():
    with open('notes.json', 'r') as f:
        notes = json.load(f)
    return notes

def print_all_notes():
    for note in notes:
        print(f"ID: {note['id']}\nЗаголовок: {note['title']}\nТело заметки: {note['message']}\nДата создания: {note['created_at']}\nДата последнего изменения: {note['updated_at']}\n")


def add_note():
    title = input("Введите заголовок заметки: ")
    message = input("Введите тело заметки: ")
    note = {
        "id": len(notes) + 1,
        "title": title,
        "message": message,
        "created_at": datetime.now().strftime("%d/%m/%Y %H:%M:%S"),
        "updated_at": datetime.now().strftime("%d/%m/%Y %H:%M:%S")
    }
    notes.append(note)
    save_notes(notes)
    print("Заметка успешно сохранена")

def edit_note():
    note_id = int(input("Введите ID заметки, которую хотите отредактировать: "))
    note = next((note for note in notes if note["id"] == note_id), None)
    if note is None:
        print("Заметка не найдена")
        return
    title = input(f"Введите новый заголовок для заметки '{note['title']}': ")
    message = input(f"Введите новое тело заметки '{note['message']}': ")
    note["title"] = title
    note["message"] = message
    note["updated_at"] = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
    save_notes(notes)
    print("Заметка успешно отредактирована")

def delete_note():
    note_id = int(input("Введите ID заметки, которую хотите удалить: "))
    note = next((note for note in notes if note["id"] == note_id), None)
    if note is None:
        print("Заметка не найдена")
        return
    notes.remove(note)
    save_notes(notes)
    print("Заметка успешно удалена")

def filter_notes_by_date():
    date_str = input("Введите дату в формате ДД/ММ/ГГГГ: ")
    date_obj = datetime.strptime(date_str, "%d/%m/%Y")
    filtered_notes = [note for note in notes if datetime.strptime(note["created_at"], "%d/%m/%Y %H:%M:%S").date() == date_obj.date()]
    
    if len(filtered_notes) == 0:
        print(f"Нет заметок, созданных {date_str}")
        return
    
    for note in filtered_notes:
        print(f"ID: {note['id']}\nЗаголовок: {note['title']}\nТело заметки: {note['message']}\nДата создания: {note['created_at']}\nДата последнего изменения: {note['updated_at']}\n")

if __name__ == "__main__":
    
    if not os.path.exists('notes.json'):
        with open('notes.json', 'w') as f:
            json.dump([], f)

    notes = read_notes()

    while True:
        command = input("Введите команду (print, add, edit, delete, filter или exit): ")

        if command == "print":
            print_all_notes()
        
        elif command == "add":
            add_note()
        
        elif command == "edit":
            edit_note()
        
        elif command == "delete":
            delete_note()
        
        elif command == "filter":
            filter_notes_by_date()
        
        elif command == "exit":
            sys.exit()
        
        else:
            print("Неверная команда. Попробуйте еще раз.")
