This is a set of files, that exhibits the flexibilty of python in bash using argparser. 
The main file is baseballStats
The two base files, people and batting, are passed through baseballEditor on the first call of the main program baseballStats. 
Subsequent calls only reference the file made by baseballEditor so the speed and memory usage is decreased after the initial call. 

Call python3 baseballStats --help (or -h) for a complete listing of programed functions. 
