package com.example.iota_experiment_4;

import static com.vaadin.flow.component.UI.getCurrent;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
@NpmPackage(value = "@iota/identity-wasm", version = "0.6.0")
@JsModule("@iota/identity-wasm/web/identity_wasm.js")
@JsModule("./script.js")
public class Web extends VerticalLayout {

  public Web() {
    Button button = new Button("Click");

    add(button);

    button.addClickListener(
        event -> getCurrent()
            .getPage()
            .executeJs("createDid")

    );
  }
}
