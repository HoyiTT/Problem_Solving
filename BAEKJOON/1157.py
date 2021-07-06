word = input().lower() 
word_list = list(set(word))
count = []

for x in word_list:
    cnt = word.count(x)
    count.append(cnt)

    if count.count(max(count)) >= 2:
        print("?")
    else:
       