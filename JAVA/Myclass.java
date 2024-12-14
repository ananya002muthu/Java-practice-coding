
import java.util.*;

import java.math.*;

class Player{

private int playerId;

private String playerName;

private int run;

private String playerType;

private String matchType;

Player(int playerId, String playerName, int run, String playerType, String matchType){

this.playerId=playerId;

this.playerName=playerName;

this.run=run;

this.playerType=playerType;

this.matchType=matchType;
}

public void setPlayerId(int playerId) {

this.playerId=playerId;

}

public int getPlayerId(){

return playerId;

}

public void setPlayerName (String playerName){

this.playerName=playerName;

}

public String getPlayerName(){

return playerName;

}

public void setRun(int run) {

this.run =run;
}

public int getRun(){

return run;

}

public void setPlayerType (String playerType) {

this.playerType=playerType;

}

public String getPlayerType(){

return playerType;

}

public void setMatchType (String matchType){

this.matchType=matchType;

}

public String getMatchType(){

return matchType;

}

}


public class Myclass{

public static void main(String[] args){

Player[] player=new Player [4];

Scanner sc=new Scanner (System.in);

for(int i=0;i<player.length;i++){

int id=sc.nextInt();

String name=sc.nextLine();

sc.nextLine();

int run=sc.nextInt();

String ptype=sc.nextLine();
String mtype=sc.nextLine();

sc.nextLine();

player[i]= new Player (id, name, run, ptype, mtype); }

String inptype=sc.nextLine();

String inmtype=sc.nextLine();

int method1=findPlayerWithLowerRuns (player, inptype);

if(method1>0){

System.out.println(method1);

}

else{

System.out.println("No such Player");

}

Player[] method2=FindPlayerByMatchType (player,inmtype);

if(method2!=null){

for(int i=0;i<method2.length; i++){

System.out.println(method2[i].getPlayerId());

}

}

else{

System.out.println("No Player with given match Type");

}

}

public static int findPlayerWithLowerRuns (Player [] player, String inptype){

int min=0;

for(int i=0;i<player.length;i++)

{

if(player[i].getPlayerType().equalsIgnoreCase(inptype))

{

if(player[i].getRun()<min)

{

min=player[i].getRun();

}

}

}

if(min>0){

return min;

}

else{

return 0;

}

}

//Choose programming Languag

public static Player[] FindPlayerByMatchType (Player[] player, String inmtype){

Player[] arr=new Player[0];

for(int i=0;i<player.length;i++){

if(player[i].getMatchType().equalsIgnoreCase(inmtype)){

arr=Arrays.copyOf (arr, arr.length+1);

arr[arr.length-1]=player[i];

}
}

Player temp;

for(int i=0;i<arr.length;i++){

{

for(int j=i+1;j<arr.length;j++){

if(arr[i].getPlayerId()< arr[j].getPlayerId()){

temp=arr[i]; arr[i]=arr[j];

arr[j]=temp;

}

}

}

}

if(arr.length>0){ return arr;

}

else{ return null;

}

}

}
