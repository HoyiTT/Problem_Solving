a = int(input())

data = [[0 for i in range(10)] for j in range(101)]

for i in range(1,10):
    data[1][i] = 1

for i in range(2,101):
    for k in range(10):
        if k == 0:
            data[i][k] = data[i-1][1]
        elif k == 9:
            data[i][k] = data[i-1][8]
        else:
            data[i][k] = data[i-1][k-1] + data[i-1][k+1]

print(sum(data[a]) % 1000000000)