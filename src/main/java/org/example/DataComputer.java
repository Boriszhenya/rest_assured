package org.example;

public class DataComputer {
    private int year;
    private float price;
    private String cpuModel;
    private String hardDiskSize;

    public DataComputer(int year, float price, String cpuModel, String hardDiskSize) {
        this.year = year;
        this.price = price;
        this.cpuModel = cpuModel;
        this.hardDiskSize = hardDiskSize;
    }

    public DataComputer() {
    }
// Getter Methods

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    // Setter Methods

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCPUModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        DataComputer dataComputer = (DataComputer) obj;

        return getYear() == dataComputer.getYear() &&
                getPrice()==(dataComputer.getPrice()) &&
                getHardDiskSize().equals(dataComputer.getHardDiskSize()) &&
                getCpuModel().equals(dataComputer.getCpuModel());
    }
}

