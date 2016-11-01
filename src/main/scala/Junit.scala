import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

@RunWith(classOf[JUnitRunner])
class Junit extends FunSuite with BeforeAndAfter {
  
  test("testtt") {
    assert("B".equals("B"))
  }
}