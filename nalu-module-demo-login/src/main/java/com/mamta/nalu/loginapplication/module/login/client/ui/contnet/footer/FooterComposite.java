package com.mamta.nalu.loginapplication.module.login.client.ui.contnet.footer;

import com.github.nalukit.nalu.client.component.AbstractCompositeController;
import com.github.nalukit.nalu.client.component.IsComponentCreator;
import com.github.nalukit.nalu.client.component.annotation.CompositeController;
import com.mamta.nalu.loginapplication.module.login.client.NaluLoginApplicationContextLoginModule;

import elemental2.dom.HTMLElement;

import java.util.logging.Logger;

@CompositeController(componentInterface = IsFooterComponent.class, component = FooterComponent.class)
public class FooterComposite
        extends AbstractCompositeController<NaluLoginApplicationContextLoginModule, IsFooterComponent, HTMLElement>
        implements IsFooterComponent.Controller,
        IsComponentCreator<IsFooterComponent> {

    private static final Logger logger = Logger.getLogger(FooterComposite.class.getName());

    public FooterComposite() {

    }

    @Override
    public void start() {

    }

    @Override
    public IsFooterComponent createComponent() {
        return new FooterComponent();
    }

}
