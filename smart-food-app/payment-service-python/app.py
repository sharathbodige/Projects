
from flask import Flask, jsonify

app = Flask(__name__)

@app.route("/pay", methods=["POST"])
def pay():
    return jsonify({"status": "Payment Successful"})

app.run(host="0.0.0.0", port=5000)
