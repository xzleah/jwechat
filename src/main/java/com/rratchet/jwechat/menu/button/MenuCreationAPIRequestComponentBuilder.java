package com.rratchet.jwechat.menu.button;

import java.util.ArrayList;
import java.util.List;

import com.rratchet.jwechat.menu.MenuCreationAPIRequest;

public abstract class MenuCreationAPIRequestComponentBuilder {

	protected MenuCreationAPIRequest request;
	
	protected MenuCreationAPIRequestComponentBuilder(MenuCreationAPIRequest request) {
		this.request = request;
	}

	protected MenuCreationAPIRequest build() {
		return request;
	}
	
	protected List<Button> getButtonList() {
		if(request.getButtonList() == null) {
			request.setButtonList(new ArrayList<Button>());
		}
		return request.getButtonList();
	}
	
	public ClickButtonBuilder clickButton(String buttonName) {
		ClickButtonBuilder builder = new ClickButtonBuilder(request);
		builder.name(buttonName);
		return builder;
	}
	
	public ViewButtonBuilder viewButton(String buttonName) {
		ViewButtonBuilder builder = new ViewButtonBuilder(request);
		builder.name(buttonName);
		return builder;
	}

}