#!/bin/bash -

declare -a arr=("${@}")

if (( $# < 2 )) 
then 
  echo "Two comand-line arguments are required"
  exit 1
fi

file=$(<${arr[0]})
echo "${file}" > output.txt
echo "The file was saved!"


echo "`wc -l ${arr[0]}` lines copied from ${arr[0]} to ${arr[1]}" 

