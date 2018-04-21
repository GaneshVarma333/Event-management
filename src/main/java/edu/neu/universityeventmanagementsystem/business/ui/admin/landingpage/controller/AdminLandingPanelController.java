package edu.neu.universityeventmanagementsystem.business.ui.admin.landingpage.controller;

import edu.neu.universityeventmanagementsystem.business.beans.CurrentUserBean;
import edu.neu.universityeventmanagementsystem.business.entity.UsersEntity;
import edu.neu.universityeventmanagementsystem.business.ui.admin.infrastructure.controller.InfrastructureController;
import edu.neu.universityeventmanagementsystem.business.ui.admin.landingpage.view.AdminLandingPanelView;
import edu.neu.universityeventmanagementsystem.business.ui.admin.users.controller.UsersController;
import edu.neu.universityeventmanagementsystem.business.ui.main.controller.MainFrameController;
import edu.neu.universityeventmanagementsystem.business.ui.shared.controller.FormController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

/**
 * AdminLandingPanelController class
 *
 * @author Raghavan Renganathan <renganathan.r@husky.neu.edu>
 * @version 1.0
 * @since 4/12/2018
 */
@Controller
@Lazy
public final class AdminLandingPanelController extends FormController {

    private MainFrameController mainFrameController;
    private AdminLandingPanelView landingPanelView;
    private CurrentUserBean currentUserBean;
    private ApplicationContext context;

    private final static Logger log = Logger.getLogger(AdminLandingPanelController.class);

    @Autowired
    public AdminLandingPanelController (MainFrameController mainFrameController,
                                        AdminLandingPanelView landingPanelView,
                                        CurrentUserBean currentUserBean,
                                        ApplicationContext context) {
        this.mainFrameController = mainFrameController;
        this.landingPanelView = landingPanelView;
        this.currentUserBean = currentUserBean;
        this.context = context;
    }

    @Override
    public void prepareAndOpenForm() {
        UsersEntity user = currentUserBean.getCurrentUser();

        if (user == null) {
            log.error("Current user is null");
            return;
        }
        registerAction((javax.swing.JButton) landingPanelView.getLogoutButton(), event -> doLogout());
        registerPanelEvents();
        landingPanelView.setUserText(user.getFirstName() + " " + user.getLastName());
        viewPanel();
    }

    private void registerPanelEvents() {
        landingPanelView.getPanelButtons().forEach(button -> {
            registerAction((javax.swing.JButton) button, this::changeView);
        });
    }

    private void changeView(java.awt.event.ActionEvent event) {
        String view = ((javax.swing.JButton) event.getSource()).getText();
        landingPanelView.setActiveButton((javax.swing.JButton) event.getSource());
        switch (view) {
            case "Dashboard":
                break;
            case "Infrastructures":
                landingPanelView.setContentPanel((context.getBean(InfrastructureController.class)).getView());
                break;
            case "Users":
                landingPanelView.setContentPanel((context.getBean(UsersController.class)).getView());
                break;
            case "Events":
                break;
            default:
        }
    }

    private void doLogout () {
        currentUserBean.setCurrentUser(null);
        mainFrameController.removeFromLayout(landingPanelView);
    }

    private void viewPanel() {
        mainFrameController.addToLayout(landingPanelView);
    }

}