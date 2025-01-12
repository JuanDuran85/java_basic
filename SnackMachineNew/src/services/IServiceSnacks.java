package SnackMachineNew.src.services;

import SnackMachineNew.src.domain.Snack;

import java.util.List;

public interface IServiceSnacks {
    public void addSnack(Snack newSnack);
    public void showSnack();
    public List<Snack> getSnacks();
}
