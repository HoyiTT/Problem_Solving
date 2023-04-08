def solution(n, t):
    answer = n
    for i in range(t):
        answer = answer * 2
    return answer