package hu.ltk.jakabgabor.starter;

import hu.ltk.jakabgabor.controller.VehicleUiController;
import hu.ltk.jakabgabor.services.VehicleRegister;
import hu.ltk.jakabgabor.services.VehicleRegisterInteractor;
import hu.ltk.jakabgabor.presenter.Presenter;
import hu.ltk.jakabgabor.view.View;

import java.util.Scanner;

public class StarterMain {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        VehicleRegister vehicleRegister = new VehicleRegister();
        VehicleRegisterInteractor vehicleRegisterInteractor = new VehicleRegisterInteractor(presenter, vehicleRegister);
        VehicleUiController vehicleUiController = new VehicleUiController(vehicleRegisterInteractor);
        View view = new View(vehicleUiController);

        presenter.setView(view);
        view.run();
    }
}
