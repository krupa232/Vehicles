package org.example;

public class Vehicles implements Comparable<Vehicles>
{
    private int maxSpeed;
    private String producer;

    private String name;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Vehicles o) {
        if (this.getMaxSpeed() > o.getMaxSpeed())
        {
            return 1;
        }
        else if (this.getMaxSpeed() < o.getMaxSpeed())
        {
            return -1;
        }
        return 0;
    }
}
