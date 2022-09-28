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
        

x = int(input())
for x in range (0,x):
    x
factorization(1000036000099)   
