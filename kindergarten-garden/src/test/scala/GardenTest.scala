import org.scalatest.matchers.should.Matchers
import org.scalatest.funspec.AnyFunSpec

/** @version 1.1.1 */
class KindergartenGardenTest extends AnyFunSpec with Matchers {

  it("partial garden - garden with single student") {
    Garden.defaultGarden("RC\nGG").plants("Alice") should be(
      List(Plant.Radishes, Plant.Clover, Plant.Grass, Plant.Grass))
  }

  it("partial garden - different garden with single student") {
    pending
    Garden.defaultGarden("VC\nRC").plants("Alice") should be(
      List(Plant.Violets, Plant.Clover, Plant.Radishes, Plant.Clover))
  }

  it("partial garden - garden with two students") {
    pending
    Garden.defaultGarden("VVCG\nVVRC").plants("Bob") should be(
      List(Plant.Clover, Plant.Grass, Plant.Radishes, Plant.Clover))
  }

  it(
    "multiple students for the same garden with three students, partial garden - second student's garden") {
    pending
    Garden.defaultGarden("VVCCGG\nVVCCGG").plants("Bob") should be(
      List(Plant.Clover, Plant.Clover, Plant.Clover, Plant.Clover))
  }

  it(
    "multiple students for the same garden with three students, partial garden - third student's garden") {
    pending
    Garden.defaultGarden("VVCCGG\nVVCCGG").plants("Charlie") should be(
      List(Plant.Grass, Plant.Grass, Plant.Grass, Plant.Grass))
  }

  it("full garden - first student's garden") {
    pending
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Alice") should be(
      List(Plant.Violets, Plant.Radishes, Plant.Violets, Plant.Radishes))
  }

  it("full garden - second student's garden") {
    pending
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Bob") should be(
      List(Plant.Clover, Plant.Grass, Plant.Clover, Plant.Clover))
  }

  it("full garden - second to last student's garden") {
    pending
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Kincaid") should be(
      List(Plant.Grass, Plant.Clover, Plant.Clover, Plant.Grass))
  }

  it("full garden - last student's garden") {
    pending
    Garden
      .defaultGarden("VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV")
      .plants("Larry") should be(
      List(Plant.Grass, Plant.Violets, Plant.Clover, Plant.Violets))
  }
}
