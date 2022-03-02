#variabel to save the data

#Memberikan Assignment Nilai
# type data : angka decimal/satuan (integer) bilangan yang tidak ada koma
data_integer = 11
print("Data : ", data_integer)
print("Bertype", type(data_integer))

# Type data : float/berkoma yaitu bilangan yang memiliki koma
data_float = 1.5
print("Data : ", data_float)
print("Bertype", type(data_float))

#Type Data : String yaitu karakter yang terdiri angka,symbol,huruf
data_string = "valdo"
print("Data : ", data_string)
print("Bertype", type(data_string))

#type Data : Biner True/False (boolean)
data_bool = False
print("Data : ", data_bool)
print("Bertype", type(data_bool))

#type Data Khusus 
#bilangan Kompleks
data_complex = complex(5,6)
print("Data : ", data_complex)
print("Bertype", type(data_complex))

#Type data dari bahasa C

#hal pertama yang harus dilakukan yaitu mengimport libary dari bahasa C tersebut
from ctypes import c_double, c_char 

data_c_double = c_double(10.5)
print("Data : ", data_c_double)
print("Bertype", type(data_c_double))