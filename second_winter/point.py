import math

b = 0
count = 0
k = int(input("k값을 입력하시오."))
d = int(input("d값을 입력하시오."))

while b*k <= d:
    a = 0
    while math.sqrt(a**2 + b**2)*k <= d:
        print(a*k, b*k)
        a += 1
        count += 1
    b += 1

print(count)
