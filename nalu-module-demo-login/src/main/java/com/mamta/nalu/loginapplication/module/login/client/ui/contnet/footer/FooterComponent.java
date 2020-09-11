package com.mamta.nalu.loginapplication.module.login.client.ui.contnet.footer;

import com.github.nalukit.nalu.client.component.AbstractCompositeComponent;

import elemental2.dom.HTMLElement;

import org.jboss.elemento.Elements;

public class FooterComponent extends AbstractCompositeComponent<IsFooterComponent.Controller, HTMLElement>
        implements IsFooterComponent {

    private HTMLElement containerElement;

    @Override
    public void render() {

        this.containerElement = Elements.div().element();
        initElement(containerElement);
    }

    @Override
    public void setTemplate(String template) {
        this.containerElement.innerHTML = template;
        containerElement.setAttribute("role", "contentinfo");

    }

}
