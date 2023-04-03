def solution(common):
    answer = 0
    
    if common[1] - common[0] == common[2] - common[1]: # 등차수열
        answer += common[-1] + (common[2] - common[1])
    elif common[2] // common[1] == common[1] // common[0]: # 등비수열
        answer = common[-1] * (common[1] // common[0])
        
    return answer