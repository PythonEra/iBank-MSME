
package com.example.monthlybill;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

//    @SerializedName("0")
//    @Expose
//    private String _0;
//    @SerializedName("id")
//    @Expose
//    private String id;
//    @SerializedName("1")
//    @Expose
//    private String _1;
//    @SerializedName("name")
//    @Expose
//    private String name;
//    @SerializedName("2")
//    @Expose
//    private String _2;
//    @SerializedName("desig")
//    @Expose
//    private String desig;
//    @SerializedName("3")
//    @Expose
//    private String _3;
//    @SerializedName("image")
//    @Expose
//    private String image;
//
//    public String get0() {
//        return _0;
//    }
//
//    public void set0(String _0) {
//        this._0 = _0;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String get1() {
//        return _1;
//    }
//
//    public void set1(String _1) {
//        this._1 = _1;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String get2() {
//        return _2;
//    }
//
//    public void set2(String _2) {
//        this._2 = _2;
//    }
//
//    public String getDesig() {
//        return desig;
//    }
//
//    public void setDesig(String desig) {
//        this.desig = desig;
//    }
//
//    public String get3() {
//        return _3;
//    }
//
//    public void set3(String _3) {
//        this._3 = _3;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
@SerializedName("0")
@Expose
private String _0;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("1")
    @Expose
    private String _1;
    @SerializedName("from_account")
    @Expose
    private String fromAccount;
    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("to_account")
    @Expose
    private String toAccount;
    @SerializedName("3")
    @Expose
    private String _3;
    @SerializedName("transfer_amount")
    @Expose
    private String transferAmount;
    @SerializedName("4")
    @Expose
    private String _4;
    @SerializedName("date")
    @Expose
    private String date;

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String get2() {
        return _2;
    }

    public void set2(String _2) {
        this._2 = _2;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String get3() {
        return _3;
    }

    public void set3(String _3) {
        this._3 = _3;
    }

    public String getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String get4() {
        return _4;
    }

    public void set4(String _4) {
        this._4 = _4;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
