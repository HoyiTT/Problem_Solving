n = int(input())
data = []

for _ in range(n):
    data.append(int(input()))

result = [1,2,4]

for i in range(3,11):
    result.append(result[i-1] + result[i-2] + result[i-3])

for k in data:
    print(result[k-1])