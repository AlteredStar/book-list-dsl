import scala.language.postfixOps

class BookListTest extends munit.FunSuite {
  test("first line of book list DSL") {
    val result = add book

    assertEquals("Add Book:", result)
  }

  test("second line of book list DSL") {
    val result = add book {
      _ typed "Web Novel"
    }

    assertEquals("Add Book: Web Novel", result)
  }

  test("third line of book list DSL") {
    val result = add book {
      _ typed "Web Novel" titled "The King's Avatar"
    }

    assertEquals("Add Book: Web Novel titled The King's Avatar", result)
  }

  test("fourth line of book list DSL") {
    val result = add book {
      _ typed "Web Novel" titled "The King's Avatar" language "CN"
    }

    assertEquals("Add Book: Web Novel titled The King's Avatar from CN", result)
  }

  test("fifth line of book list DSL") {
    val result = add book {
      _ typed "Web Novel" titled "The King's Avatar" language "CN" chapter 1735
    }

    assertEquals("Add Book: Web Novel titled The King's Avatar from CN at chapter 1735", result)
  }
}