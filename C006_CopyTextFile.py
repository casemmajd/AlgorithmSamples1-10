#!/usr/bin/env python36

import sys

if (len(sys.argv) < 2):
  print ("Two comand-line arguments are required")
  sys.exit(1)

inputFile = open(sys.argv[1], "r")
outputFile = open(sys.argv[2], "w")

lineCount = 0
pos = inputFile.tell()
while ( True ):
  line = inputFile.readline()
  outputFile.write(line)
  lineCount += 1

  newpos = inputFile.tell()
  if newpos == pos:
    break
  else:
    pos = newpos
inputFile.close()
outputFile.close()

print (lineCount, "lines copied from", sys.argv[1], "to", sys.argv[2] )
