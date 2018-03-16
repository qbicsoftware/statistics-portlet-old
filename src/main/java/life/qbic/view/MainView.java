package life.qbic.view;

import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;
import life.qbic.StatisticsViewUI;
import life.qbic.logging.Log4j2Logger;
import life.qbic.logging.Logger;

public class MainView {

    private static Logger logger = new Log4j2Logger(StatisticsViewUI.class);

    private final TabSheet tabSheet;

    public MainView(StatisticsViewUI statisticsViewUI){
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        statisticsViewUI.setContent(layout);

        this.tabSheet = new TabSheet();
        layout.addComponent(tabSheet);
    }

    public void addChart(TabView tabView, String title){
        this.tabSheet.addTab(tabView.getTab()).setCaption(title);
    }
}
