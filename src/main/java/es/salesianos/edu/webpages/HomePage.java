package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	public HomePage() {
		BookmarkablePageLink bookmarkablePageLink1 = new BookmarkablePageLink("linkAuthorForm", AuthorPage.class);
		BookmarkablePageLink bookmarkablePageLink2 = new BookmarkablePageLink("linkListAuthor",
				ListAuthorPage.class);
<<<<<<< HEAD
		BookmarkablePageLink bookmarkablePageLink3 = new BookmarkablePageLink("linkMenuForm", MenuPage.class);
		BookmarkablePageLink bookmarkablePageLink4 = new BookmarkablePageLink("linkListMenu", ListMenuPage.class);
=======
		BookmarkablePageLink bookmarkablePageLink3 = new BookmarkablePageLink("linkBookForm", BookPage.class);
		BookmarkablePageLink bookmarkablePageLink4 = new BookmarkablePageLink("linkListBook", ListBookPage.class);
>>>>>>> e3571aa96a941bf077c07f4cc4863ef0a2697634
		add(bookmarkablePageLink1);
		add(bookmarkablePageLink2);
		add(bookmarkablePageLink3);
		add(bookmarkablePageLink4);
	}
}
