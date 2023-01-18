fun main(){
    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem Anhang
    // .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.

    println("Bitte, geb mal der Länge vom Viereck ein: ")
    var laenge : Int = readln().toInt()

    println("Bitte, geb mal der Breite vom Viereck ein: ")
    var breite : Int = readln().toInt()

    var flaeche : Int = laenge*breite//TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Länge

    println("Die fläche des Vierecks ist: $flaeche meter")

    // bitte println wieder auskommentieren zum Testen

}