#mengubah type suatu data ke type lainnya.

#data Integer
print("=========================Data Integer=============================")
data_int = 1;
print("Data = ", data_int, ", Type = ",type(data_int))

data_float = float(data_int)
data_string = str(data_int)
data_boolean = bool(data_int) #akan false jika nilai int = 0

print("Data = ", data_float,",Type = ",type(data_float))
print("Data = ", data_string,",Type = ",type(data_string))
print("Data = ", data_boolean,",Type = ",type(data_boolean))

#data Float
print("=========================Data Float=============================")
data_float = 8.9;
print("Data = ", data_float, ", Type = ",type(data_float))

data_integer = int(data_float)
data_string = str(data_float)
data_boolean = bool(data_float) #akan false jika nilai int = 0

print("Data = ", data_integer,",Type = ",type(data_integer))
print("Data = ", data_string,",Type = ",type(data_string))
print("Data = ", data_boolean,",Type = ",type(data_boolean))

#data Float
print("=========================Data Boolean=============================")
data_boolean = True; # data pada boolean ada 2 yaitu True apabila besar atau kecil dari 0, dan jika bernilai 0 maka false
print("Data = ", data_boolean, ", Type = ",type(data_boolean))

data_integer = int(data_boolean)
data_string = str(data_boolean)
data_float = float(data_boolean) #akan false jika nilai int = 0

print("Data = ", data_integer,",Type = ",type(data_integer))
print("Data = ", data_string,",Type = ",type(data_string))
print("Data = ", data_float,",Type = ",type(data_float))

#data String
print("=========================Data String=============================")
data_string = "10";
print("Data = ", data_string, ", Type = ",type(data_string))

data_integer = int(data_string) #jika text maka akan error, jika inputan string berupa angka maka akan jalan
data_boolean = bool(data_string) #akan bernilai false jika input data_string kosong,dan akan bernilai true jika inputan data_string memiliki data
data_float = float(data_string) #jika text maka akan error, jika inputan string berupa angka maka akan jalan

print("Data = ", data_integer,",Type = ",type(data_integer))
print("Data = ", data_boolean,",Type = ",type(data_boolean))
print("Data = ", data_float,",Type = ",type(data_float))