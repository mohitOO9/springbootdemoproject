package bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import entity.Author;
import entity.Book;
import entity.Publisher;
import repositories.AuthorRepository;
import repositories.BookRepository;
import repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside Run Methods");
		saveData();	
	}
	
	public void saveData() {
		Publisher publisher = new Publisher("TMH","2ndStreet","Jaipur","Rajasthan","302001");
		publisherRepository.save(publisher);
		
		Author author = new Author("Rod","Jhonson");
		
		Book book = new Book("j2ee","2345657788");
		book.setPublisher(publisher);

		author.getBook().add(book);
		book.getAuthors().add(author);
		publisher.getBook().add(book);
		
		authorRepository.save(author);
		bookRepository.save(book);
		publisherRepository.save(publisher);
		
		//.............................
		
		Author author1 = new Author("Evans","Chris");
		Book book1 = new Book("Domain Driven language","9876567898");

		publisher.getBook().add(book1);

		author1.getBook().add(book1);

		book1.getAuthors().add(author1);
		book1.setPublisher(publisher);
		
		
		authorRepository.save(author1);
		bookRepository.save(book1);
		publisherRepository.save(publisher);
		
		
		System.out.println("Bootstrape started ....... ");
		System.out.println("Number Of Books : "+bookRepository.count());
		System.out.println("Number Of Authors : "+authorRepository.count());
		System.out.println("Number Of Publisher : "+publisherRepository.count());

	}

}
