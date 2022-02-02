package tabs

final case class Tuning(notes: Vector[String]) {
    assert(notes.length == 6)
    assert(notes.forall(Vector("A", "A#", "B", "C" , "C#", "D", "D#", "E", "F", "F#", "G", "G#").contains(_)))

    def getString(i: Int): Char = notes(i-1)

}

object Tuning {
    def apply(notes: String): Tuning = {
        notes.toLowerCase match {
            case "standard" => Tuning(Vector["E", "A", "D", "G", "B", "E"])
            case "dropd" => Tuning(Vector["D", "A", "D", "G", "B", "E"])
            case _ => Tuning(notes.split(",").filterNot(_.isEmpty))
        }
    }

}