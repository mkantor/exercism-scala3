case class WordCount(phrase: String) {
  def countWords: Map[String, Int] = {
    phrase
      .trim()
      .toLowerCase()
      .split("""^\W*|\W*$|\W*[^\w']+\W*""")
      .foldLeft(Map.empty) { (words, word) =>
        words.updatedWith(word) {
          case None => Some(1)
          case Some(count) => Some(count + 1)
        }
      }
  }
}
