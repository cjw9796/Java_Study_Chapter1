package Book;

import java.util.ArrayList;



public class BookController {
	private ArrayList<Book> list = new ArrayList<>();
	
	public BookController() {
		
	}
	
	
	public BookController(ArrayList<Book> list) {
		super();
		this.list = list;
	}


	boolean insertBook(Book b, String author) {
		boolean res = list.add(b);
		if(res) {
			return 1;
		}else {
			return 0;
		}
		
	}
}
