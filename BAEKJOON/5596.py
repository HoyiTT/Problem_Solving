N = list(map(int, input().split()))
S = list(map(int, input().split()))
A = 0
B = 0
for i in range (0,4):
    A += N[i]
    B += S[i]
if A > B:
    print(A)
elif A < B:
    print(B)
elif A == B:
    print(A)