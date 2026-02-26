public class WashingMachineExecutor {

    public static void main(String[] args) {

        WashingMachine.createWashingMachine("LG","WM-T1000",7,35000,1200,true,"White","5 Star",true,"Cotton");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Samsung","WF-1123",6,30000,1000,true,"Silver","4 Star",true,"Quick Wash");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("IFB","Senator Plus",8,40000,1200,true,"Grey","5 Star",true,"Wool");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Bosch","WAB24260IN",7,45000,1400,true,"White","5 Star",true,"Delicate");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Whirlpool","FreshCare",6.5,32000,1100,true,"Blue","4 Star",true,"Eco");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Haier","HW70",7,28000,1000,true,"Silver","4 Star",false,"Quick Wash");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Panasonic","NA-F70",6,27000,800,true,"White","3 Star",false,"Cotton");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("LG","WM-T1200",8,38000,1200,true,"Grey","5 Star",true,"Intensive");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("Samsung","WF-2100",7,39000,1400,true,"White","5 Star",true,"Synthetic");
        WashingMachine.getWashingMachineDetails();

        WashingMachine.createWashingMachine("IFB","Elite Plus",9,50000,1400,true,"Silver","5 Star",true,"Daily Wash");
        WashingMachine.getWashingMachineDetails();
    }
}