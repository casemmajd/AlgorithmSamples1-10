#!/bin/bash -


printValuesInList() {
  eval list=("$(echo '${'$1'[@]}')")
  echo "[${list[@]}]" 
}

numbers=(42 17 256);
printValuesInList numbers;



