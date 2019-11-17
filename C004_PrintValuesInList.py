#!/usr/bin/env python36


def printValuesInList(list):
  print ("[ ", end='')
  for i in range(len(list)):
    print (list[i], end='')
    if (i < len(list)-1): print (", ", end='')
  print (" ]", end='')


array=(1, 2, 3, 4, 5)
printValuesInList(array)