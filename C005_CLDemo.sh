#!/bin/bash -

declare -a arr=("${@}")
echo "You entered " $# " command-line arguments"
if (( $# > 0 )) 
then
  for (( i=0; i<$#; i++ )) do
    echo "   " " ${arr[$i]}";
  done
fi