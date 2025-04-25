import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.util.HashMap;

public class ExchangeController {
    private final HashMap<String, Double> currencyValues = new HashMap<>();

    @FXML private ChoiceBox<String> fromCurrency;
    @FXML private ChoiceBox<String> toCurrency;
    @FXML private Spinner<Double> fromValue;
    @FXML private Label result;


    @FXML
    public void initialize(){
        currencyValues.put("GEL", 1.00);
        currencyValues.put("USD", 0.37);
        currencyValues.put("EUR", 0.34);
        currencyValues.put("GBP", 0.29);

        fromCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
        toCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");

        fromCurrency.setValue("GEL"); // default
        toCurrency.setValue("USD");

        fromValue.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(
                0.0,  // start
                10000.0, // end
                0.0, // default
                0.1 // step
        ));
        fromValue.setEditable(true);

        fromCurrency.setOnAction(e -> convert());
        toCurrency.setOnAction(e -> convert());
        fromValue.valueProperty().addListener((obs, oldVal, newVal) -> convert());

        convert();
    }

    private void convert(){
        String from = fromCurrency.getValue();
        String to = toCurrency.getValue();
        Double amount = fromValue.getValue();

        if(from.isEmpty() || to.isEmpty()){
            result.setText("Please enter the currencies you want to convert");
        }

        Double converted = amount * currencyValues.get(to) / currencyValues.get(from);

        result.setText(String.format("%.2f %s", converted, to));
    }
}