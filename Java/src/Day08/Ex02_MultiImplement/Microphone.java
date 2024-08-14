package Day08.Ex02_MultiImplement;

public interface Microphone {

	int inputVolumMax = 50;		// 음성 인식 최대 볼륨
	int inputVolumMin = 0;		// 음성 인식 최소 볼륨
	
	// 음성 인식
	String receiveVoice(String voice);
	
}
