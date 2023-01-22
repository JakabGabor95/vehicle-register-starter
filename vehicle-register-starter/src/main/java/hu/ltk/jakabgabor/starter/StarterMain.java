package hu.ltk.jakabgabor.starter;

import hu.ltk.jakabgabor.controller.VehicleUiController;
import hu.ltk.jakabgabor.services.VehicleRegister;
import hu.ltk.jakabgabor.services.VehicleRegisterInteractor;
import hu.ltk.jakabgabor.presenter.Presenter;

import java.util.Scanner;

public class StarterMain {
    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        VehicleRegister vehicleRegister = new VehicleRegister();
        VehicleRegisterInteractor vehicleRegisterInteractor = new VehicleRegisterInteractor(presenter, vehicleRegister);
        VehicleUiController vehicleUiController = new VehicleUiController(new Scanner(System.in), vehicleRegisterInteractor);
        vehicleUiController.run();

    }
}
