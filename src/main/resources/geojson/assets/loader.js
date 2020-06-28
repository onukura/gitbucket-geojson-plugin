function renderMap () {
  var map = L.map("map");
  L.tileLayer(
    'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: 'Map data &copy; <a href="http://openstreetmap.org/">OpenStreetMap</a>',
      maxZoom: 18
      }
    ).addTo(map);
  var data = JSON.parse(document.getElementById("geodata").innerHTML);
  var geojson = L.geoJson(data);
  geojson.addTo(map);
  map.fitBounds(geojson.getBounds());
};
window.onload = renderMap();
