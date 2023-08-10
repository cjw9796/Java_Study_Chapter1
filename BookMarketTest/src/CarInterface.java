
public interface CarInterface {
	void printBookList(); 

    boolean isCartInBook(int bookId);

    void insertBook(int bookId, String bookTitle, int bookPrice);

    void removeCart(int numId);

    void deleteBook();
    
    
}
