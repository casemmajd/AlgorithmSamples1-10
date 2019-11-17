#!/usr/bin/env python36

import sys;

print ("You entered ", (len(sys.argv)-1), " command-line arguments")

if ( len(sys.argv) > 1 ):
  print ("They were:")
  for i in range(len(sys.argv)-1):
    print ("   " + sys.argv[i+1])

