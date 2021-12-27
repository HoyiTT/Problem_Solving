m = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ] 
y = [ "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]

dal, il = map(int, input().split())
# ex input 3 3
day = 0
for i in range(0,dal-1):
    day+=m[i]

day += il

print(y[day % 7])