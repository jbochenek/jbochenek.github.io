# -*- coding: utf-8 -*-
"""
Created on Wed Nov 27 10:34:21 2019

@author: JLBOCHENEK
"""
import math 

# A function to print all prime factors of  
# a given number n 
def primeFactors(n): 
    print("Finding factors for", n)
    # Print the number of two's that divide n 
    while n % 2 == 0: 
        print(2)
        n = n / 2
          
    # n must be odd at this point 
    # so a skip of 2 ( i = i + 2) can be used 
    for i in range(3,int(math.sqrt(n))+1,2): 
          
        # while i divides n , print i ad divide n 
        while n % i== 0: 
            print(i) 
            n = n / i 
              
    # Condition if n is a prime 
    # number greater than 2 
    if n > 2: 
        print(n)
          
# Driver Program to test above function 
import timeit

#testing select numbers
n = [2,3,4,5,6,7,8,9,10,11,12,100,113,122,151,273]
for m in n:
    start = timeit.default_timer()
    primeFactors(m)
    stop = timeit.default_timer()
    execution_time = stop - start
    print("Program Executed in ",execution_time)

#testing numbers 1 to 300 and graph    
import pandas as pd
n = list(range(1,300))
l = []
for m in n:
    start = timeit.default_timer()
    primeFactors(m)
    stop = timeit.default_timer()
    execution_time = stop - start
    l.append(execution_time)

d = pd.DataFrame({'number': n, 'execution time': l})

import matplotlib.pyplot as plt
d.set_index('number')['execution time'].plot()

#testing even numbers only and graphing
import pandas as pd
n = n[0:300:2]
l = []
for m in n:
    start = timeit.default_timer()
    primeFactors(m)
    stop = timeit.default_timer()
    execution_time = stop - start
    l.append(execution_time)

d = pd.DataFrame({'number': n, 'execution time': l})

import matplotlib.pyplot as plt
d.set_index('number')['execution time'].plot()
