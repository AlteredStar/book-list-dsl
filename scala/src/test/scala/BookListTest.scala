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
}