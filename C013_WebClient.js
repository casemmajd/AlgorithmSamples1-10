const https = require('https');

https.get('https://jsonplaceholder.typicode.com/todos/1', (response) => {
  console.log(response.statusCode + (response.statusCode==200? " OK" : " Failed"));

  let data = '';
  response.on('data', (chunk) => {
    data += chunk;
  });

  response.on('end', () => {
    console.log(JSON.stringify(JSON.parse(data), null, 2));
  });
});
