def add(book)
  book
end

def book
  @book_details = 'Add Book:'
end

def type(book_type)
  @book_details << " #{book_type}"
end

def title(book_title)
  @book_details << " titled #{book_title}"
end

def language(book_lang)
  @book_details << " from #{book_lang}"
end
