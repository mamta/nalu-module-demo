package com.mamta.nalu.loginapplication.module.login.client.ui.contnet.footer;

import com.github.nalukit.nalu.client.component.IsComponent;
import com.github.nalukit.nalu.client.component.IsCompositeComponent;

import elemental2.dom.HTMLElement;

public interface IsFooterComponent extends IsCompositeComponent<IsFooterComponent.Controller, HTMLElement> {

    interface Controller extends IsComponent.Controller {

    }

    void setTemplate(String template);

}
