package Lesson.MyApp;

public class Constants {

    String apiKey = "6a1afe2c4b4602a65b173d2c2ce4d34d";
    String city = "Ulyanovsk";
    String goodRequestApi = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
}


//http://api.openweathermap.org/data/2.5/weather?q=Ulyanovsk&appid=6a1afe2c4b4602a65b173d2c2ce4d34d&units=metric
//{"coord":{"lon":48,"lat":54},
// "weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],
// "base":"stations",
// "main":{"temp":275.15,"feels_like":268.51,"temp_min":275.15,"temp_max":275.15,"pressure":1025,"humidity":37},
// "visibility":8000,
// "wind":{"speed":5,"deg":310},
// "clouds":{"all":40},
// "dt":1586279552,
// "sys":{"type":1,"id":9043,"country":"RU","sunrise":1586225125,"sunset":1586273657},
// "timezone":14400,
// "id":479119,
// "name":"Ulyanovsk Oblast",
// "cod":200}