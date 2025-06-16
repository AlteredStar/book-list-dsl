require 'test/unit'
require_relative '../src/add_book_dsl.rb'

class AddBookTest < Test::Unit::TestCase
  def test_first_line
    result = add book

    assert_equal('Add Book:', result)
  end

  def test_second_line
    result = add book
      type 'Web Novel'

    assert_equal('Add Book: Web Novel', result)
  end

  def test_third_line
    result = add book
      type 'Web Novel'
      title "The King's Avatar"

    assert_equal('Add Book: Web Novel titled The King\'s Avatar', result)
  end

  def test_fourth_line
    result = add book
      type 'Web Novel'
      title "The King's Avatar"
      language 'CN'

    assert_equal('Add Book: Web Novel titled The King\'s Avatar from CN', result)
  end

  def test_fifth_line
    result = add book
      type 'Web Novel'
      title "The King's Avatar"
      language 'CN'
      chapters 1735

    assert_equal('Add Book: Web Novel titled The King\'s Avatar from CN at chapter 1735', result)
  end
end
