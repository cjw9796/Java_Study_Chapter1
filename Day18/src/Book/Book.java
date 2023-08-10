package Book;

import java.util.Objects;

public class Book {
	String title;
	String author;
	String category;
	int price;
	
	public Book() {} //기본 생성자 

	//생성자 
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	
	//getter, setter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//tostring 
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}

	//hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}

	//compare to 
	public int compareTo(String anotherString) {
		return author.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return author.compareToIgnoreCase(str);
	}
	
	
	
	
	
	
	
	
	
	
	

}
