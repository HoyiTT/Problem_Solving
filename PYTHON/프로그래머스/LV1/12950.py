def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        a = []
        for k in range(len(arr1[0])):
            a.append(arr1[i][k] + arr2[i][k])
        answer.append(a)
    return answer