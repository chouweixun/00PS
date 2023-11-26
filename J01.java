class LCD {
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
class CPU {
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
class HD {
    private int cap;
    private int cost;
    public HD(int cap) {
        this.cap = cap;
        if (cap == 120) {
            this.cost = 2400;
        } else if (cap == 160) {
            this.cost = 2800;
        }
    }
    public int getCost() {
        return cost;
    }
}
class MiniNote {
    private LCD lcd;
    private CPU cpu;
    private HD hd;
    public MiniNote() {
        this.lcd = new LCD(10);
        this.cpu = new CPU(1.66);
        this.hd = new HD(120);
    }
    public double getCost() {
        return (lcd.getCost() + cpu.getCost() + hd.getCost())*1.4;
    }
    public int getPrice() {
        return (int) ((getCost() / 1.4) * 2);
    }
}
class Note15 {
    private LCD lcd;
    private CPU cpu;
    private HD hd;
    public Note15() {
        this.lcd = new LCD(15);
        this.cpu = new CPU(2.2);
        this.hd = new HD(160);
    }
    public double getCost() {
        return (lcd.getCost() + cpu.getCost() + hd.getCost())*1.4;
    }
     public int getPrice() {
        return (int) ((getCost() / 1.4) * 2);
    }
}
public class J01 {
    public static void main(String[] args) {
        MiniNote mininote = new MiniNote();
        Note15 note15 = new Note15();
        System.out.println("MiniNote cost: " + mininote.getCost()+", price: " + mininote.getPrice());
        System.out.println("Note15 cost " + note15.getCost()+", price: " + note15.getPrice());
    }
}
