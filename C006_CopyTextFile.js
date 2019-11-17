const fs = require('fs');


if (process.argv.length < 4) {
  console.log("Two comand-line arguments are required");
  process.exit(1);
}

var file = fs.readFileSync(process.argv[2], 'utf8');
fs.writeFileSync(process.argv[3], file, function(err) {
    if(err) {
        return console.log(err);
    }

    console.log("The file was saved!");
}); 
// Note since you're using fs.readFile which reads the entire file - it deals with opening and closing file for you, so you don't need to close anything

var lineCount = file.split('\n').length;
console.log("%d lines copied from %s to %s", lineCount, process.argv[2], process.argv[3]);