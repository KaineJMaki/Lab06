package com.example.chartbuild;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private PieChart pieChart;
    @FXML private BarChart barChart;
    @FXML private CategoryAxis xAxis;
    @FXML private NumberAxis yAxis;

    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };

    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };

    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };
    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Double> series1 = new XYChart.Series<>();
        XYChart.Series<String, Double> series2 = new XYChart.Series<>();

        series1.getData().add(new XYChart.Data<>("One", avgHousingPricesByYear[0]));
        series1.getData().add(new XYChart.Data<>("Two", avgHousingPricesByYear[1]));
        series1.getData().add(new XYChart.Data<>("Three", avgHousingPricesByYear[2]));
        series1.getData().add(new XYChart.Data<>("Four", avgHousingPricesByYear[3]));
        series1.getData().add(new XYChart.Data<>("Five", avgHousingPricesByYear[4]));
        series1.getData().add(new XYChart.Data<>("Six", avgHousingPricesByYear[5]));
        series1.getData().add(new XYChart.Data<>("Seven", avgHousingPricesByYear[6]));
        series1.getData().add(new XYChart.Data<>("Eight", avgHousingPricesByYear[7]));

        series2.getData().add(new XYChart.Data<>("One", avgCommercialPricesByYear[0]));
        series2.getData().add(new XYChart.Data<>("Two", avgCommercialPricesByYear[1]));
        series2.getData().add(new XYChart.Data<>("Three", avgCommercialPricesByYear[2]));
        series2.getData().add(new XYChart.Data<>("Four", avgCommercialPricesByYear[3]));
        series2.getData().add(new XYChart.Data<>("Five", avgCommercialPricesByYear[4]));
        series2.getData().add(new XYChart.Data<>("Six", avgCommercialPricesByYear[5]));
        series2.getData().add(new XYChart.Data<>("Seven", avgCommercialPricesByYear[6]));
        series2.getData().add(new XYChart.Data<>("Eight", avgCommercialPricesByYear[7]));

        barChart.getData().addAll(series1, series2);
        barChart.setLegendVisible(false);
        barChart.getYAxis().setTickLabelsVisible(false);
        barChart.getXAxis().setTickLabelsVisible(false);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data(ageGroups[0], purchasesByAgeGroup[0]),
                        new PieChart.Data(ageGroups[1], purchasesByAgeGroup[1]),
                        new PieChart.Data(ageGroups[2], purchasesByAgeGroup[2]),
                        new PieChart.Data(ageGroups[3], purchasesByAgeGroup[3]),
                        new PieChart.Data(ageGroups[4], purchasesByAgeGroup[4]),
                        new PieChart.Data(ageGroups[5], purchasesByAgeGroup[5])
                );
        pieChart.getData().addAll(pieChartData);
        pieChart.setLegendVisible(false);
        pieChart.setLabelsVisible(false);
    }
}