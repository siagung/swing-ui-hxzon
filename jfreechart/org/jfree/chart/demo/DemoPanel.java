// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package org.jfree.chart.demo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.jfree.chart.JFreeChart;

public class DemoPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    List<JFreeChart> charts;

    public DemoPanel(java.awt.LayoutManager layoutmanager) {
        super(layoutmanager);
        charts = new ArrayList<JFreeChart>();
    }

    public void addChart(JFreeChart jfreechart) {
        charts.add(jfreechart);
    }

    public JFreeChart[] getCharts() {
        int i = charts.size();
        JFreeChart ajfreechart[] = new JFreeChart[i];
        for (int j = 0; j < i; j++)
            ajfreechart[j] = (JFreeChart) charts.get(j);

        return ajfreechart;
    }
}
