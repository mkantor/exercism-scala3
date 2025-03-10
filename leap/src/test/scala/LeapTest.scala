import org.scalatest.matchers.should.Matchers
import org.scalatest.funspec.AnyFunSpec

/** @version 1.3.0 */
class LeapTest extends AnyFunSpec with Matchers {

  it("year not divisible by 4: common year") {
    Leap.leapYear(2015) should be (false)
  }

  it("year divisible by 4, not divisible by 100: leap year") {
    Leap.leapYear(1996) should be (true)
  }

  it("year divisible by 100, not divisible by 400: common year") {
    Leap.leapYear(2100) should be (false)
  }

  it("year divisible by 400: leap year") {
    Leap.leapYear(2000) should be (true)
  }
}
