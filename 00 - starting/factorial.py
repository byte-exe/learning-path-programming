import time

start_time = time.time()

#program factorial.
value=int(input('Input :'))
min_range = 0
x = 1
print(str(value)+'!=',end='')
while value>min_range:
    print(value,end=' x ')
    x=x*value
    value-=1
print(min_range,'=',x)

print("Waktu Yang dibutuhkan untuk menjalankan program",time.time() - start_time,"second")
#compile python to byte code