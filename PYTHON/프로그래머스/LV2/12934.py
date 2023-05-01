def solution(n):
    sq = n ** 0.5
    
    if sq % 1 == 0:
        answer = (int(sq) + 1) ** 2
    else:
        answer = -1
    return answer