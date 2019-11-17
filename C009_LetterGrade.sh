#!/bin/bash -


function letterGrade() {
  numGrade=$1
  if (( numGrade >= 90 )) 
    then
    echo 'A'
    elif (( numGrade >= 80 )) 
      then
      echo 'B'
      elif (( numGrade >= 65 )) 
        then
        echo 'C'
        elif (( numGrade >= 50 )) 
          then
          echo 'D'
          else
          echo 'F'
  fi
}

numLetter=$(letterGrade 85)  #echo | letterGrade 95
echo $numLetter
