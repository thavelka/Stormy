# Stormy

This app began with another great Team Treehouse tutorial about web APIs, and I've continued to add features on my own.

The finished product of the tutorial left us with a weather app that had a hardcoded location, and would retreive weather data using the forecast.io API.

After completing the tutorial, I immediately set out to find a way to implement automatic location detection. The solution was to use the LocationManager to pull coordinates from the best source, then use the Geocoder to translate those coordinates into City, State format.

I will continue development on this project until I've created something that I would use over any other weather app. This will most likely warrant a complete rebuild with 100% original code very soon, so stay tuned.

Features:
* Finds location using GPS or network.
* Retrieves weather data for your location.
* Displays local time, temp, humidity, chance of rain, and a short summary.
* Refresh button to get new data.
* Small icon that changes with the weather.
* Dynamic background color based on time and weather

Planned features:
* Hourly info displayed by dragging slider.
* ~~Dynamic backgrounds based on time and weather.~~
* Notifications?

This is by far the most challenging Android application I've made so far, and I plan to keep challenging myself with it.
So far, I've learned how to...
* use an API key to pull data using specified parameters in a URL.
* parse JSON data and create a JSON object.
* set class variables to new data from JSON.
* handle network and GPS unavailablity.
* get location data from GPS and Networks.
* use a keystore to generate a signed APK.

Screenshots:
(It's pure coincidence that the temperature is the same in both Bryan and Seoul)
<img src="http://i.imgur.com/pQSe3Ko.png?1" />
<img src="http://i.imgur.com/UG0UScz.png?1" />
<img src="http://i.imgur.com/kJMZ1n4.png?1" />
