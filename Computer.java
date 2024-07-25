public class Computer implements Electronics {
    RAM ram;
    Storage storage;
    Processor processor;

    public Computer(RAM ram, Storage storage, Processor processor) {
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", processor=" + processor +
                '}';
    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean off() {
        return false;
    }

}

