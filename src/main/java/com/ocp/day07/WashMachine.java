
package com.ocp.day07;


public class WashMachine {
    private boolean isOpen = false ;
    private int mode;
    private boolean haveWater;

    //建構子
    public WashMachine(int mode){
        this.mode = mode; //this.代表的是類別的變數
    }
    /*沒有寫建構子的話，系統編譯時會給預設建構子
       public WashMachine(){
        }
        沒有參數的建構子
    */
    
    public void open(){
        System.out.println("開門");
        isOpen = true;
    }
    
    public void cloth(){
        if(isOpen){
            System.out.println("放衣服");
        }
        else{
            System.out.println("請先關門");
        }
    }
    
    
    public void close(){
        System.out.println("關門");
        isOpen = false;
    }
    
    
    public void water(){
        if(!isOpen){
            System.out.println("注水");
            haveWater = true;
        }
        else{
            System.out.println("逼逼逼，門沒關!");
        }
    }
    
    
    public void play(){
        
        //確認是否已經注水
        if(!haveWater){
        System.out.println("請先注水");
        return;
        }
        
        //確認洗衣模式
        switch(mode){
            case 1:
                System.out.println("柔洗模式");
                break;
                
            case 2:
                System.out.println("強洗模式");
                break;
                
            case 3:
                System.out.println("靜置模式");
                break;
                
            default:
                System.out.println("尚未選擇，請選擇模式");
                return;
        }
 
        System.out.println("開始洗衣服");
        System.out.println("衣服洗完了");
        
        
    }
    
    
    
}
