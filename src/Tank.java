package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Shootable;

public class Tank extends Kendaraan implements Shootable {
    @Override
    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
