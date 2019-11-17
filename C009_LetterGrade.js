
function letterGrade(numGrade) {
    if (numGrade >= 90)
      return 'A';   
    else if (numGrade >= 80)
      return 'B';   
    else if (numGrade >= 65)
      return 'C';   
    else if (numGrade >= 50)
      return 'D';   
    else
      return 'F';   
  }

console.log(letterGrade(89));