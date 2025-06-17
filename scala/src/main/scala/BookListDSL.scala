import scala.language.dynamics

object add extends Dynamic {
  var bookDetails = new StringBuilder()

  def book =
    bookDetails.append(s"Add Book:")
    bookDetails.result
}
