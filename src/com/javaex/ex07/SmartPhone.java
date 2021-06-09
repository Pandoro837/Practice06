package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){

    	if("음악".equals(str)){
            playMusic();
        }else if("통화".equals(str)){
            super.execute(str);
        } else {
        	playApp();
        }
        
    }
 
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
  
    //메소드작성
    public void playApp() {
    	System.out.println("앱실행");
    }
    
}
