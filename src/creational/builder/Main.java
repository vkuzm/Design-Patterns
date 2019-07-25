package creational.builder;

public class Main {
    public static void main(String[] args) {
        PCBuilder pc = new PCBuilder.Builder("Intel Core i7")
                .GPU("GForce 6800")
                .SSD("Samsung EVO 320 GB")
                .motherboard("Asus 5555")
                .RAM("16 GB")
                .build();

        PCBuilder pc2 = new PCBuilder.Builder("Razen 5")
                .HDD("Samsung 1 TB")
                .keyboard("Genius Pro")
                .mouse("Logitech 10100")
                .screen("1920x1080")
                .build();

        System.out.println("FIRST PC");
        System.out.println("CPU: " + pc.getCPU());
        System.out.println("GPU: " + pc.getGPU());
        System.out.println("SSD: " + pc.getSSD());
        System.out.println("Motherboard: " + pc.getMotherboard());
        System.out.println("RAM: " + pc.getRAM());

        System.out.println("");
        System.out.println("SECOND PC");
        System.out.println("CPU: " + pc2.getCPU());
        System.out.println("Screen: " + pc2.getScreen());
        System.out.println("HHD: " + pc2.getHDD());
        System.out.println("Keyboard: " + pc2.getKeyboard());
        System.out.println("Mouse: " + pc2.getMouse());
    }
}
