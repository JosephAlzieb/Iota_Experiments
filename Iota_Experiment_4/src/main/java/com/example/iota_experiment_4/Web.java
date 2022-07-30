package com.example.iota_experiment_4;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
@NpmPackage(value = "@iota/identity-wasm", version = "0.6.0")
@JsModule("@iota/identity-wasm/web/identity_wasm.js")
@JsModule("./script.js")
public class Web extends Div {

  public Web() {
    Button button = new Button("Click");

    add(button);

    button.addClickListener(
        event -> UI.getCurrent().getPage().executeJs("script.aa()" )
            .then(e -> System.out.println(e.asString()))
    );
  }

//  public static void logElementSize(String name,
//      String element) {
//    Page page = UI.getCurrent().getPage();
//
//    page.executeJs(
//        "console.log($0 + ' size:', "
//            + "$1 )",
//        name, element);
//  }
}
