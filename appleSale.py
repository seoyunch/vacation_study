answer = 0
score = [1,2,3,1,2,3,1]
k = 3
m = 4
p = []
for i in range(k, 0, -1):
    if i not in p and i in score:
        p.append(i)
print(p)
score.sort(reverse = True)
print(score)
a = 0

while len(score) >= m:
    count = 0
    a += 1
    print("상자", a)
    for i in range(len(p)):
        if count < m:
            count += score.count(p[i])
            score = [x for x in score if x != p[i]]
            print(count, score, 1)
        elif count > m:
            for j in range(count-m):
                score.insert(j, p[i-1])
            count -= count - m
            answer += m*p[i-1]
            print(count, score, 2)
        else:
            print(count, score, 3)
            answer += m*p[i-1]
            break
    print("가격", answer)

print(answer)
            
