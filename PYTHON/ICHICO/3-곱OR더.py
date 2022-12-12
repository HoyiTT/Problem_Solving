data = input()
result = 0

for i in range(len(data)):
    a = int(data[i])
    if a <= 1 or result <= 1:
        result += a
    else:
        result *= a

print(result)