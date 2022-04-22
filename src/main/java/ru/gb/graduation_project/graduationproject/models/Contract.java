package ru.gb.graduation_project.graduationproject.models;


import javax.persistence.*;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "pasport")
    private String pasport;

    @Column(name = "period")
    private int period;

    @Column(name = "sum")
    private int sum;

    @Column(name = "status")
    private String status;

    public Contract() {
    }

    public Contract(int id, String name, String pasport, int period, int sum, String status) {
        this.id = id;
        this.name = name;
        this.pasport = pasport;
        this.period = period;
        this.sum = sum;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pasport='" + pasport + '\'' +
                ", period=" + period +
                ", sum=" + sum +
                ", status='" + status + '\'' +
                '}';
    }
}