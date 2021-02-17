enum Plant {
    case Grass
    case Clover
    case Radishes
    case Violets
}
object Plant {
    def fromLetter(letter: Char): Option[Plant] = {
        letter match {
            case 'G' => Some(Grass)
            case 'C' => Some(Clover)
            case 'R' => Some(Radishes)
            case 'V' => Some(Violets)
            case _ => None
        }
    }
}

enum Student(val index: Int) {
    case Alice extends Student(0)
    case Bob extends Student(1)
    case Charlie extends Student(2)
    case David extends Student(3)
    case Eve extends Student(4)
    case Fred extends Student(5)
    case Ginny extends Student(6)
    case Harriet extends Student(7)
    case Ileana extends Student(8)
    case Joseph extends Student(9)
    case Kincaid extends Student(10)
    case Larry extends Student(11)
}
object Student {
    def fromName(name: String): Option[Student] = {
        name match {
            case "Alice" => Some(Alice)
            case "Bob" => Some(Bob)
            case "Charlie" => Some(Charlie)
            case "David" => Some(David)
            case "Eve" => Some(Eve)
            case "Fred" => Some(Fred)
            case "Ginny" => Some(Ginny)
            case "Harriet" => Some(Harriet)
            case "Ileana" => Some(Ileana)
            case "Joseph" => Some(Joseph)
            case "Kincaid" => Some(Kincaid)
            case "Larry" => Some(Larry)
            case _ => None
        }
    }
}

// Since there is unfortunately no room in the required output types for errors
// we'll skip over invalid/excess inputs.

case class Garden(row1: IndexedSeq[Plant], row2: IndexedSeq[Plant]) {
    def plants(studentName: String): IndexedSeq[Plant] = {
        Student.fromName(studentName) match {
            case None => IndexedSeq.empty
            case Some(student) =>
                val start = student.index * 2
                val end = start + 2
                row1.slice(start, end) ++ row2.slice(start, end)
        }
    }
}
object Garden {
    def defaultGarden(plantsDescription: String): Garden = {
        val rowsOfPlants = plantsDescription
            .split('\n')
            .map(_.flatMap(Plant.fromLetter))

        rowsOfPlants.toList match {
            case Nil => Garden(IndexedSeq.empty, IndexedSeq.empty)
            case firstRow :: Nil => Garden(firstRow, IndexedSeq.empty)
            case firstRow :: secondRow :: _ => Garden(firstRow, secondRow)
        }
    }
}
