public class J03 {
    static class LCD {
        private int size;
        private int cost;
        public LCD(int size) {
            this.size = size;
            if (size == 10) {
                this.cost = 2000;
            } else if (size == 15) {
                this.cost = 2500;
            } else if (size == 17) {
                this.cost = 3000;
            }
        }
        public int getCost() {
            return cost;
        }
    }
    static class CPU {
        private double speed;
        private int cost;
        public CPU(double speed) {
            this.speed = speed;
            if (speed == 1.66) {
                this.cost = 6000;
            } else if (speed == 2.2) {
                this.cost = 8000;
            } else if (speed == 2.4) {
                this.cost = 11000;
            }
        }
        public int getCost() {
            return cost;
        }
    }
    static class HD {
        private int capacity;
        private int cost;
        public HD(int capacity) {
            this.capacity = capacity;
            if (capacity == 120) {
                this.cost = 2400;
            } else if (capacity == 160) {
                this.cost = 2800;
            }
        }
        public int getCost() {
            return cost;
        }
    }
    static class PC {
        private CPU cpu;
        private HD hd;

        public PC() {
            this.cpu = new CPU(2.4);
            this.hd = new HD(160);
        }
        public int getCost() {
            return cpu.getCost() + hd.getCost() + 500;
        }
        public double getPrice() {
            return (getCost()-500)* 1.8;
        }
    }
    static class Note15 {
        private LCD lcd;
        private CPU cpu;
        private HD hd;

        public Note15() {
            this.lcd = new LCD(15);
            this.cpu = new CPU(2.2);
            this.hd = new HD(160);
        }
        public int getCost() {
            return (lcd.getCost() + cpu.getCost() + hd.getCost())*2;
        }
        public double getPrice() {
            return getCost();
        }
    }
    static class AIIPC {
        public static boolean isExpensive(PC pc, Note15 note15) {
            return pc.getPrice() > note15.getPrice();
        }
    }
    public static void main(String[] args) {
        PC pc = new PC();
        Note15 note15 = new Note15();
        if (AIIPC.isExpensive(pc, note15)) {
            System.out.println("PC is more expensive than Note15");
        } else {
            System.out.println("Note15 is more expensive than PC");
        }
    }
}
