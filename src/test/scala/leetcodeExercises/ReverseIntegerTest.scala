package leetcodeExercises

import org.scalatest.funsuite.AnyFunSuiteLike
import org.scalatest.Assertions._

class ReverseIntegerTest extends AnyFunSuiteLike {

  test("Test 1") {
    val result = ReverseInteger.reverse(-123) // Call the function you want to test
    val result2 = ReverseInteger.reverse(123)
    assert(result == -321) // Use 'assert' to check if the result matches the expected value
    assert(result2 == 321)
  }
}
/*
  test("Test 2: Multiple assertions") {
    val list = List(1, 2, 3, 4, 5)

    assert(list.length == 5)
    assert(list.head == 1)
    assert(list.contains(3))
  }*/
/*

  test("Test 3: Using 'assertResult' for more descriptive failure messages") {
    val result = someFunction()

    assertResult(expectedValue, "The result should match the expected value") {
      result // The actual result
    }
  }

  test("Test 4: Using 'assertThrows' to check for exceptions") {
    assertThrows[SomeException] {
      // Code that should throw an exception
      throw new SomeException("This is an exceptional situation")
    }
  }
}*/
