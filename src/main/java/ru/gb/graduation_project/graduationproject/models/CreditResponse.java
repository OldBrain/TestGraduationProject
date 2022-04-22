package ru.gb.graduation_project.graduationproject.models;


import javax.persistence.*;

@Entity
@Table(name = "creditresponse")
public class CreditResponse {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "idrequest")
    private int idrequest;

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

    public CreditResponse() {
    }

    public CreditResponse(int id, int idrequest, String name, String pasport, int period, int sum, String status) {
        this.id = id;
        this.idrequest = idrequest;
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

    public int getIdrequest() {
        return idrequest;
    }

    public void setIdrequest(int idrequest) {
        this.idrequest = idrequest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    @Override
    public String toString() {
        return "CreditResponse{" +
                "id=" + id +
                ", idrequest=" + idrequest +
                ", name='" + name + '\'' +
                ", period=" + period +
                ", sum=" + sum +
                ", status='" + status + '\'' +
                '}';
    }
}