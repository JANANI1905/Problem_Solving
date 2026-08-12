'''Reverse a tuple without using slicing'''
n = (10, 20, 30, 40, 50)
rev = ()
for i in range(len(n)-1, -1, -1):
    rev = rev +(n[i],)
print(rev)