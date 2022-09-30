def factorization(x):
    d = 2
    data = []
    while d <= x:
        if x % d == 0:
            data.append(d)
            x = x / d
        else:
            d = d + 1
    for i in data:
        if i > 10 ** 6:
            continue
        else:
            print("NO")
            return False
    print("YES")
    return True


x = int(input())
data2 = []
for x in range(x):
    data2.append(int(input()))
for x in data2:
    factorization(x)
