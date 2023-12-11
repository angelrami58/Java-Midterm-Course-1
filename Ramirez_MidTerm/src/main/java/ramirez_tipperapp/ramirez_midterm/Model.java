/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_midterm;

/**
 * Angel Ramirez-Rivera IT DEV-110 MIDTERM
 * @author angelramirez-rivera
 */
public class Model {
    private double score1,score2,score3;

    public void setScore1(double score){
        score1 = score;
    }    
    public double getScore1(){
        return score1;
    }    
    public void setScore2(double score){
        score2 = score;
    }    
    public double getScore2(){
        return score2;
    }    
    public void setScore3(double score){
        score3 = score;
    }    
    public double getScore3(){
        return score3;
    }
    public double calcAverage(){
        return ((score1+score2+score3)/3);
    }
}
