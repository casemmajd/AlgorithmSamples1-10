var http = require('http');


http.createServer(function (req, res) {
  res.writeHead(200, {'Content-Type': 'application/json'});

  var url = req.url;
  if (url === '/test'){
    res.write("{param1: 1, param2: 2}");
    res.end();
  }
}).listen(8000, function(){
  console.log("The URL of this server is http://localhost:8000/test");
});