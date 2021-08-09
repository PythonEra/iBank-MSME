package com.example.monthlybill;

public class historyproduct {

//    $temp['from_account'] = $from_account;
//    $temp['to_account'] = $to_account;
//    $temp['transfer_amount'] = $transfer_amount;
//    $temp['date'] = $date;

    private int id;
    private String from_account;
    private String to_account;
    private double transfer_amount;
    private double date;
    private String image;

    public historyproduct(int id, String from_account, String to_account, double transfer_amount, double date, String image) {
        this.id = id;
        this.from_account = from_account;
        this.to_account = to_account;
        this.transfer_amount = transfer_amount;
        this.date = date;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getfrom_account() {
        return from_account;
    }

    public String getto_account() {
        return to_account;
    }

    public double gettransfer_amount() {
        return transfer_amount;
    }

    public double getdate() {
        return date;
    }

    public String getImage() {
        return image;
    }
}
