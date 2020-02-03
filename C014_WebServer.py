#!/usr/bin/env/ python36


from flask import Flask

app = Flask(__name__)

@app.route('/test', methods=['GET'])
def getJson():
  return jsonify('{param1': 1, 'param2': 2})

if __name__ == '__main__':
  app.run(debug=True)



# http://localhost:5000
