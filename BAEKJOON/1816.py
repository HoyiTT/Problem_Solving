x = int(input())
data = []

for _ in range(x):
    data.append(int(input()))

for a in data:
    for j in range(2, 1000001):
        if a % j == 0:
            ans = "NO"
            break
        elif j == 1000000:
            ans = "YES"
    print(ans)