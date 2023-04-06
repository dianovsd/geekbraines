def count_vowels(word):
    vowels = "аеёиоуыэюя"
    count = 0
    for letter in word:
        if letter.lower() in vowels:
            count += 1
    return count

def check_rhythm(poem):
    phrases = poem.split()
    vowels_count = [count_vowels(phrase) for phrase in phrases]
    if len(set(vowels_count)) == 1:
        print("Парам пам-пам")
    else:
        print("Пам парам")

poem = input("Введите стихотворение Винни-Пуха: ")
check_rhythm(poem)