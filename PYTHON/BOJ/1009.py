def solution():
    num = int(input())
    for _ in range(num):
        a ,b = map(int, input().split())
        num = a % 10

        if num == 0:
            print(10)
        elif num == 1 or num == 5 or num == 6:
            print(num)
        elif num == 4 or num == 9:
            b = b % 2
            if b == 1:
                print(num)
            else:
                print(num * num % 10)
        else:
            b = b % 4
            if b == 0:
                print((num ** 4) % 10 % 10 % 10)
            else:
                print((num ** b) % 10 % 10 % 10)
        

if __name__ == '__main__':
    solution()