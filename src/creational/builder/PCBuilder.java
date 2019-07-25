package creational.builder;

class PCBuilder {
    private String screen;
    private String CPU;
    private String GPU;
    private String motherboard;
    private String RAM;
    private String HDD;
    private String SSD;
    private String mouse;
    private String keyboard;

    private PCBuilder(Builder builder) {
        this.screen = builder.screen;
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.motherboard = builder.motherboard;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.SSD = builder.SSD;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
    }

    static class Builder {
        private String screen;
        private String CPU;
        private String GPU;
        private String motherboard;
        private String RAM;
        private String HDD;
        private String SSD;
        private String mouse;
        private String keyboard;

        public Builder(String CPU) {
            this.CPU = CPU;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder motherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder RAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder HDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder SSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        public Builder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public PCBuilder build() {
            return new PCBuilder(this);
        }
    }

    public String getScreen() {
        return screen;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getSSD() {
        return SSD;
    }

    public String getMouse() {
        return mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }
}
