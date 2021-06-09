package com.javaex.ex03;

public class Shape {

//	필드
	protected String fillColor;	//부모에 있는 필드를 자식에서 가져다 쓰기 위해서는
	protected String lineColor; //프로텍티드를 사용해주어야 한다

//	생성자
	public Shape() {//자식 생성자는 부모 생성자를 필요로 하는데, 자식에서 지정한
	}				//부모 생성자가 없을 경우, 부모의 디폴트 생성자를 부른다
					//따라서, 부모에 디폴트 생성자가 없을 경우 오류가 발생한다
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//	셋터
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
}

