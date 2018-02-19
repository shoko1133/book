/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

public class Product implements java.io.Serializable{

private int  id;
private String name;
private int price;

//各フィールドの値を取得するためのゲッタ
public int getId(){
return id;
}

public String getName(){
return name;
}
public int getPrice(){
return price;
}

//値を設定するためのセッタ
public void setId(int id){
this.id=id;
}

public void setName(String name){
this.name=name;
}

public void setPrice(int price){
this.price=price;
}

}