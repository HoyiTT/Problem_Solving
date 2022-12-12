n, m = map(int,input().split())

for _ in range (0,n):
    data = list(map(int, input().split()))
    
    result = 0
    
    min_value = min(data)
    result = max(min_value, result)
    
print(result)
    




