
'''for i in range(3):
    for j in range(3):
        print(1, end=" ")
    print()


o/p:
1 1 1 
1 1 1 
1 1 1 '''


count = 1
for i in range(3):
    for j in range(3):
        print(count, end=" ")
        count += 1
    print()
