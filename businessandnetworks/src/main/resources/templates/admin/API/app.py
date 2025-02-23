from flask import Flask, jsonify
import requests

app = Flask(__name__)


@app.route('/api/pokemon/<name>', methods=['GET'])
def get_pokemon(name):
    url = f'https://pokeapi.co/api/v2/pokemon/{name}'
    response = requests.get(url)
    
    if response.status_code == 200:
        data = response.json()
        pokemon_info = {
            "name": data["name"],
            "id": data["id"],
            "height": data["height"],
            "weight": data["weight"],
            "types": [t["type"]["name"] for t in data["types"]],
            "abilities": [a["ability"]["name"] for a in data["abilities"]]
        }
        return jsonify(pokemon_info)
    else:
        return jsonify({"error": "Pokémon no encontrado"}), 404

if __name__ == '__main__':
    app.run(debug=True)
