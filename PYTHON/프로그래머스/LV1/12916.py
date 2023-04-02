def solution(s):
    answer = False
    
    low = s.lower()
    p = low.count('p')
    y = low.count('y')

    if p == y:
        answer = True

    return answer