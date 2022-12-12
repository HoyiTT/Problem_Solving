d =[]
for x in range(1,1001):
    d+=[x] * x
a ,b = map(int, input().split())
print(sum(d[a-1:b]))