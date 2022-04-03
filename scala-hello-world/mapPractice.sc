val states = Map("MO" -> "Missouri", "UT" -> "Utah", "CA" -> "California", "OK" -> "Oklahoma")

val orderVisited = List("OK", "CA", "MO", "UT")

orderVisited.flatMap(code => states.get(code))