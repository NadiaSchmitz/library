import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		int i;
		int order, card_number, check = 0, book_index, reader_index = 0;
		String[] names= {"Peter", "Hans", "Greta", "Lee"};
		String[] surnames = {"Müller", "Ratz", "Kringold", "Toss"};
		int[] card_numbers = {19563, 63541, 52741, 9645};
		String[] courses = {"Wirtschaft", "Psychologie", "Informatik", "Maschinenbau"};
		String[] birthdays = {"15.01.1997", "24.11.1999", "02.03.1998", "16.08.1997"};
		long[] pnone_numbers = {1111111111, 1222222222, 1333333333, 1444444444};
		Reader[] readers = new Reader [4];
		String[] titles = {"Thirteen", "In ewiger Freundschaft", "Natrium Chlorid", "The Accomplice", "The Devil's Advocate", "Hunted", "One Fatal Mistake"};
		String[] authors = {"Steve Cavanagh", "Nele Neuhaus", "Jussi Adler-Olsen", "Steve Cavanagh", "Steve Cavanagh", "Alex Knight", "Tom Hunt"};
		Book[] books = new Book [7];
		int[] title_order;
		
		for (i = 0; i < names.length; i++) {
			readers[i] = new Reader();
			readers[i].setName(names[i]);
			readers[i].setSurname(surnames[i]);
			readers[i].setCardNumber(card_numbers[i]);
			readers[i].setCourse(courses[i]);
			readers[i].setBurthday(birthdays[i]);
			readers[i].setPhoneNumber(pnone_numbers[i]);
		}
		
		for (i = 0; i < books.length; i++) {
			books[i] = new Book();
			books[i].setTitle(titles[i]);
			books[i].setAuthor(authors[i]);
		}
		
		order = IOTools.readInteger("Geben Sie Anzahl der Bücher, die Sie bekommen wollen: ");
		
		// Take Book #1
		
//		if (order > books.length) {
//			
//			System.out.println("Es gibt so viel Bücher nicht.");
//
//		} else {
//			
//			card_number = IOTools.readInteger("Geben Sie Ihre Karte ein (19563, 63541, 52741, 9645): ");
//			
//			for (i = 0; i < names.length; i++) {
//				if (card_number == card_numbers[i]) {
//					readers[i].takeBook(card_number, order);
//					check = check + 1;
//				}
//				
//				if (check == 0) {
//					System.out.println("Es gibt keine Karte mit dieser Nummer.");
//				}
//			}
//			
//		}
		
		
		// Take Book #2
		title_order = new int[order];
		
		if (order > books.length) {
			
			System.out.println("Es gibt so viel Bücher nicht.");

		} else {
			
			card_number = IOTools.readInteger("Geben Sie Ihre Karte ein (19563, 63541, 52741, 96451): ");
			
			for (i = 0; i < names.length; i++) {
				if (card_number == card_numbers[i]) {
					reader_index = i;
					check = check + 1;
				} 
			}
			
			System.out.println("In der Bibliotek gibt es folgende Bücher vorhanden: ");
			System.out.println("0 - Thirteen");
			System.out.println("1 - In ewiger Freundschaft");
			System.out.println("2 - Natrium Chlorid");
			System.out.println("3 - The Accomplice");
			System.out.println("4 - The Devil's Advocate");
			System.out.println("5 - Hunted");
			System.out.println("6 - One Fatal Mistake");
			
			for (i = 0; i < order; i++) {
				
				book_index = IOTools.readInteger("Geben Sie ein Buch ein: ");
				title_order[i] = book_index;
				
			}
			
			readers[reader_index].takeBook(title_order, card_number, order, titles);
			
			if (check == 0) {
				System.out.println("Es gibt keine Karte mit dieser Nummer.");
			}
		}
	}

}
