string = input()

if string == " ":
    print(0)
else:
    words = string.split(" ")

    while '' in words :
        words.remove('')

print(len(words))