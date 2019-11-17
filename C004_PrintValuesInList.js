
function printValuesInList(list) {
  process.stdout.write('[');
  for (i=0; i<list.length; i++) {
    if (i>0) process.stdout.write(',');
    process.stdout.write(`${list[i]}`);
  }
  console.log(']');
}

numbers = [42, 17, 256];
printValuesInList(numbers);
