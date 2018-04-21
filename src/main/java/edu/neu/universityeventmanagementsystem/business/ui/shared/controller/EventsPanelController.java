package edu.neu.universityeventmanagementsystem.business.ui.shared.controller;

import edu.neu.universityeventmanagementsystem.business.ui.shared.view.EventEntityView;
import edu.neu.universityeventmanagementsystem.business.ui.shared.view.EventsPanelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.awt.*;

/**
 * EventsPanelController class
 *
 * @author  Raghavan Renganathan <renganathan.r@husky.neu.edu>
 * @version 1.0
 * @since   Apr 19, 2018
 */
@Controller
public final class EventsPanelController extends FormController {

    private EventsPanelView eventsPanelView;
    private ApplicationContext context;

    @Autowired
    public EventsPanelController(EventsPanelView eventsPanelView,
                                 ApplicationContext context) {
        this.eventsPanelView = eventsPanelView;
        this.context = context;
    }

    @Override
    public void prepareAndOpenForm() {
        for (int i = 0; i < 10; i++)
            addEventToThePane("test-" + i);
        eventsPanelView.revalidate();
        eventsPanelView.repaint();
    }

    private void addEventToThePane(String type) {
        EventEntityView event = context.getBean(EventEntityView.class);
        event.setEventName(type);
        eventsPanelView.addToPanel(event, type);
    }

    public Component getView() {
        prepareAndOpenForm();
        return eventsPanelView;
    }
}
