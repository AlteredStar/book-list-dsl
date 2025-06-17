import scala.language.dynamics

object add extends Dynamic {
  var bookDetails = new StringBuilder()

  def book =
    bookDetails.append(s"Add Book:")
    bookDetails.result

  def book(bookBlock : add.type => add.type) =
    bookBlock(this)
    bookDetails.result

  infix def typed(bookType : String) =
    bookDetails.append(s" ${bookType}")
    this
}
