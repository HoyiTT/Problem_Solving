n = int(input())

data=[[0 for i in range(10)]for a in range(1001)]

for i in range(10):
    data[1][i] = 1

for i in range(2,1001):
    for j in range(10):
        data[i][j] = data[i][j-1] + data[i-1][j]

print(sum(data[n])%10007)