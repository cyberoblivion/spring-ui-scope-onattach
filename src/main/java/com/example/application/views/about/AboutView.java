package com.example.application.views.about;

import com.example.application.SimpleUIScopeService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.context.ApplicationContext;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@UIScope
@SpringComponent
@PreserveOnRefresh
public class AboutView extends VerticalLayout {

    ApplicationContext applicationContext;

    public AboutView(ApplicationContext applicationContext) {
        System.out.println("AboutView created");
        this.applicationContext = applicationContext;
        setSpacing(false);

//        Image img = new Image("images/empty-plant.png", "placeholder plant");
//        img.setWidth("200px");
//        add(img);

        add(new H2("Each time you refresh the browser while on About view (f5 or refresh button) a new SimpleUIScopeService will be created"));
        add(new Paragraph("See application logs"));

        setSizeFull();
        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        SimpleUIScopeService bean = applicationContext.getBean(SimpleUIScopeService.class);        
    }   
}
