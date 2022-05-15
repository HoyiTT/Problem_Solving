import sys
input = sys.stdin.readline

n = int(input())

for a in range(n):
    data = []
    r = int(input())
    for _ in range(2):
        data.append(list(map(int, input().split())))

    if r == 1:
        print(max(data[0],data[1]))
    else:
        data[0][1] = data[0][1] + data[1][0]
        data[1][1] = data[0][0] + data[1][1]

        for k in range(2,r):
            data[0][k] = max(data[0][k] + data[1][k-1],data[0][k] + data[1][k-2])
            data[1][k] = max(data[1][k] + data[0][k-1],data[1][k] + data[0][k-2])
    print(max(data[0][r-1],data[1][r-1]))    
