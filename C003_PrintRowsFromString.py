#!/usr/bin/env python36


def printRow(ch, N):
  for i in range(N):
    print (ch, end='')


def printRowsFromString(str):
  for i in range(len(str)):
    printRow(str[i], 25)

printRowsFromString('Casem')