package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;

public class MainController {

    @FXML
    private Circle circle;
    
    private double x;
    private double y;
    
    
//    @FXML
//    public void initialize() {
//    	// 키보드 이벤트 등록
//    	setEvent();
//    }
//
//    /**
//     * 키보드로 도형을 이동시키는 이벤트 등록
//     */
//    @FXML
//    public void setEvent() {
////    	Circle circle = (Circle) root.lookup("#circle");
//    	if( circle != null ) {
//    		System.out.println("원의 반지름 : " + circle.getRadius());
//    	}
//    	else {
//    		System.err.println("원을 찾을 수 없습니다.");
//    		return;
//    	}
//    	
//    	// 키 입력 이벤트 등록
//    	Main.scene.setOnKeyPressed( event -> {
//    		double x = circle.getCenterX();		// 원의 중심 x좌표
//    		double y = circle.getCenterY();		// 원의 중심 y좌표
//    		
//    		switch ( event.getCode() ) {		// event.getCode() : 입력한 키의 코드 값
//    		case UP:								// 방향키 위쪽
//    			System.out.println("UP");
//    			circle.setCenterY( y-=10 );
//    			break;
//    		case DOWN:								// 방향키 아래쪽
//    			System.out.println("DOWN");
//    			circle.setCenterY( y+=10 );
//    			break;
//    		case LEFT:								// 방향키 왼쪽
//    			System.out.println("LEFT");
//    			circle.setCenterX( x-=10 );
//    			break;
//    		case RIGHT:								// 방향키 오른쪽
//    			System.out.println("RIGHT");
//    			circle.setCenterX( x+=10 );
//    			break;
//    		}
//    	});
//    }
    @FXML
    void up(ActionEvent event) {
    	System.out.println("UP");
    	circle.setCenterY( y-=10 );
    }
 
    @FXML
    void down(ActionEvent event) {
    	System.out.println("DOWN");
    	circle.setCenterY( y+=10 );

    }

    @FXML
    void left(ActionEvent event) {
    	System.out.println("LEFT");
    	circle.setCenterX( x-=10 );

    }

    @FXML
    void right(ActionEvent event) {
    	System.out.println("RIGHT");
    	circle.setCenterX( x+=10 );

    }


}
