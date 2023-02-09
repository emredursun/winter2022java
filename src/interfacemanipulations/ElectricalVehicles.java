package interfacemanipulations;

public abstract class ElectricalVehicles implements AirCondition{

    @Override
    public void electronicAc(){

        System.out.println("Electrical vehicle AC...");

    }

    @Override
    public void bacteriaKiller(){
        System.out.println("Electrical vehicle bacterikillers...");
    }


    public abstract void moveSmooth();
}
