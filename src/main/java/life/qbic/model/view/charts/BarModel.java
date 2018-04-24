package life.qbic.model.view.charts;
import com.vaadin.addon.charts.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fhanssen
 * Example: https://demo.vaadin.com/charts/#BasicBar
 */
public class BarModel extends AChartModel<ListSeries>{

    private final List<Series> series;
    private final XAxis xAxis;
    private final YAxis yAxis;

    public BarModel(Configuration configuration, String title, String subtitle,
                    Tooltip tooltip, Legend legend, AxisTitle xAxisTitle, AxisTitle yAxisTitle,PlotOptionsBar options){

        super(configuration, title, subtitle, tooltip, legend, options);

        series = new ArrayList<>();
        super.configuration.setSeries(series);
        xAxis = super.configuration.getxAxis();
        yAxis = super.configuration.getyAxis();
        xAxis.setTitle(xAxisTitle);
        yAxis.setTitle(yAxisTitle);

    }

    public void addXCategorie(String... cat){
        xAxis.setCategories(cat);
    }

    public void setyMin(int yMin){
        yAxis.setMin(yMin);
    }

    @Override
    public void addData(ListSeries... listSeries){
        series.addAll(Arrays.asList(listSeries));
    }

    public void addData(DataSeries... dataSeries){
        series.addAll(Arrays.asList(dataSeries));
    }

    public void setXAxisType(AxisType type){
        xAxis.setType(type);
    }

    public void clearData(){
        series.clear();
    }

}