def solution(num, total):
    if num % 2 == 1:
        answer = [total//num]
        num -= 1

    else:
        answer = [total//num, total//num+1]
        num -= 2
    
    while num > 0:
        answer.append(min(answer)-1)
        answer.append(max(answer)+1)
        num -= 2
        
    answer.sort()
    return answer