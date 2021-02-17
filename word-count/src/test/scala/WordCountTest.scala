import org.scalatest.matchers.should.Matchers
import org.scalatest.funspec.AnyFunSpec

/** @version 1.2.0 */
class WordCountTest extends AnyFunSpec with Matchers {

  it("count one word") {
    WordCount("word").countWords should be(Map(("word", 1)))
  }

  it("count one of each word") {
    pending
    WordCount("one of each").countWords should be(
      Map(("one", 1), ("of", 1), ("each", 1)))
  }

  it("multiple occurrences of a word") {
    pending
    WordCount("one fish two fish red fish blue fish").countWords should be(
      Map(("blue", 1), ("two", 1), ("fish", 4), ("one", 1), ("red", 1)))
  }

  it("handles cramped lists") {
    pending
    WordCount("one,two,three").countWords should be(
      Map(("one", 1), ("two", 1), ("three", 1)))
  }

  it("handles expanded lists") {
    pending
    WordCount("one,\ntwo,\nthree").countWords should be(
      Map(("one", 1), ("two", 1), ("three", 1)))
  }

  it("ignore punctuation") {
    pending
    WordCount("car: carpet as java: javascript!!&@$%^&").countWords should be(
      Map(("as", 1), ("car", 1), ("java", 1), ("carpet", 1), ("javascript", 1)))
  }

  it("include numbers") {
    pending
    WordCount("testing, 1, 2 testing").countWords should be(
      Map(("testing", 2), ("1", 1), ("2", 1)))
  }

  it("normalize case") {
    pending
    WordCount("go Go GO Stop stop").countWords should be(
      Map(("go", 3), ("stop", 2)))
  }

  it("with apostrophes") {
    pending
    WordCount("First: don\'t laugh. Then: don\'t cry.").countWords should be(
      Map(("laugh", 1), ("don't", 2), ("then", 1), ("first", 1), ("cry", 1)))
  }

  it("with quotations") {
    pending
    WordCount("Joe can\'t tell between \'large\' and large.").countWords should be(
      Map(("can't", 1),
          ("large", 2),
          ("joe", 1),
          ("between", 1),
          ("tell", 1),
          ("and", 1)))
  }

  it("multiple spaces not detected as a word") {
    pending
    WordCount(" multiple   whitespaces").countWords should be(
      Map(("multiple", 1), ("whitespaces", 1)))
  }
}
