package es.salesianos.edu.webpages;

import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import es.salesianos.edu.model.Menu;
import es.salesianos.edu.service.BocadillosService;

public class MenuPage extends WebPage {

	@SpringBean
	BocadillosService service;

	public MenuPage() {

		Form<Menu> form = new Form<Menu>("formInsert", new CompoundPropertyModel(new Menu())) {

			@Override
			protected void onSubmit() {
				FeedbackMessage message = null;
				super.onSubmit();
				Menu menu = getModelObject();
				if(!(menu.getType().equalsIgnoreCase("longaniza") || menu.getType().equalsIgnoreCase("tofu"))){
					message = new FeedbackMessage(this, "error con los datos", FeedbackMessage.ERROR);
					System.out.println("Error!!!!");
				}else if(!(menu.getOrange().equalsIgnoreCase("si") || menu.getOrange().equalsIgnoreCase("no"))){
					message = new FeedbackMessage(this, "error con los datos", FeedbackMessage.ERROR);
				}
				if(message == null){
					service.insertar(menu);
					System.out.println("Insertado!!!");
					message = new FeedbackMessage(this, "insertado", FeedbackMessage.INFO);
					getFeedbackMessages().add(message);
				}else{
					getFeedbackMessages().add(message);
				}
//				if (!menu.getType().equalsIgnoreCase("tofu") || !menu.getType().equalsIgnoreCase("longaniza")) {
//					message = new FeedbackMessage(this, "error con los datos", FeedbackMessage.ERROR);
//				} else if (!menu.getOrange().equalsIgnoreCase("si") || !menu.getOrange().equalsIgnoreCase("no")) {
//					message = new FeedbackMessage(this, "error con los datos", FeedbackMessage.ERROR);
//				}
//				if (message == null) {
//					service.insertar(menu);
//				} else {
//					getFeedbackMessages().add(message);
//				}
			}

		};
		form.add(new Label("nameStudentLabel", getString("author.name")));
		form.add(new Label("meatLabel", getString("type.of.meat")));
		form.add(new Label("orangeLabel", getString("want.orange")));
		form.add(new RequiredTextField("name"));
		form.add(new TextField("type"));
		form.add(new TextField("orange"));
		FeedbackPanel feedbackPanel = new FeedbackPanel("feedbackMessage");
		feedbackPanel.setOutputMarkupId(true);
		add(feedbackPanel);

		add(form);

	}

}
