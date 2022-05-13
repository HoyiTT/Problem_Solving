n = int(input())
data = [0 for i in range(n+1)]

if n < 3:
    print(1)
else:
    data[1] = 1
    data[2] = 1

    for i in range(3,n+1):
        data[i] = data[i-1] + data[i-2]
    print(data[n])
