package Bridge.Pseudocode;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnable()) {
            device.enable();
        } else {
            device.disable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void chanelUp() {
        device.setChanel(device.getChanel() + 1);
    }

    public void chanelDown() {
        device.setChanel(device.getChanel() -1);
    }





}
