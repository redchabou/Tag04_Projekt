fun main (){
    // Addiere das Alter deiner Eltern und subtrahiere das Alter von dir und deinen Geschwistern von der Summe.
    // Lege das Alter der Personen jeweils als Variable an. Gib das Ergebnis mit dem println()-Befehl aus.
    var vater : Int = 78
    var muter : Int = 65
    var bruder1 : Int = 24
    var schwister1 : Int = 32
    var schwister2 : Int = 30
    var bruder2 : Int = 28
    var meiner : Int = 28

    var elternAlter : Int = vater + muter
    var geschwisterAlter : Int = bruder2 + bruder1 + schwister1 + schwister2 + meiner
    println("$elternAlter - $geschwisterAlter")
    var unterschied : Int = elternAlter - geschwisterAlter
    println(unterschied)

}