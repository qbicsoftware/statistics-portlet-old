package life.qbic.model.charts;

import com.vaadin.addon.charts.model.*;
import com.vaadin.addon.charts.PointClickEvent;
import life.qbic.model.AModel;

import java.util.Arrays;

/**
 * @author fhanssen
 * Example: https://demo.vaadin.com/charts/#PieChart , https://demo.vaadin.com/charts/#DonutChart
 */
public class PieChartModel extends AChartModel {

    private final DataSeries series;

    public PieChartModel(Configuration configuration, String title, String subtitle, Tooltip tooltip, Legend legend, PlotOptionsPie options) {
        super(configuration, title, subtitle, tooltip, legend);

        this.configuration.setPlotOptions(options);
        this.series = new DataSeries();
        this.configuration.setSeries(series);
    }


    public void addData(DataSeriesItem... dataSeries){
        Arrays.stream(dataSeries).forEach(this.series::add);
    }

    public void addDonatPieData(DataSeries... dataSeries){
        this.configuration.setSeries(dataSeries);
    }


    public void clearData(){
        this.series.clear();
    }

    public String getDataName(PointClickEvent event){
        return series.get(event.getPointIndex()).getName();
    }

}
