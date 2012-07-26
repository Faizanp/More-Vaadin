package com.morevaadin.vaadin7.html.js;

import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;

@SuppressWarnings("serial")
public class JavascriptIntegrationView extends Panel {

    public JavascriptIntegrationView() {

	FormLayout layout = new FormLayout();

	addComponent(layout);

	Link blog = new Link("A Java Geek", new ExternalResource("http://blog.frankel.ch/"));
	Link morevaadin = new Link("More Vaadin", new ExternalResource("http://morevaadin.com/"));
	
	new JavascriptTooltipExtension().extend(blog);
	new JavascriptTooltipExtension().extend(morevaadin);

	layout.addComponent(blog);
	layout.addComponent(morevaadin);
    }
}