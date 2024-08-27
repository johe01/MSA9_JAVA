package Day13.Ex05_Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1. Movie 영화 클래스 정의
 * 2. Movie 변수는 title, author, price로 변수 선언
 * 3. 영화를 제목순으로 오름차순 정렬
 * 	  - String 의 compareTo() 를 활용
 * 		해당문자열.compareTo(비교문자열)
 * 		* 해당문자열이 사전순으로 더 뒤에 있으면 (양수)
 * 		* 해당문자열이 사전순으로 더 앞에 있으면 (음수)
 * 		* 같은 문자열이면 0
 */

class Movie implements Comparable<Movie> {
	
	String title;
	String author;
	int price;
	public Movie() {
		this("제목없음", "작자미상", 0);
	}
	
	public Movie(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Movie o) {
		// * 제목순으로 오름차순
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		return result;			// -result (내림차순)
	}	
}

public class ComparableEx2 {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("영화1", "저자1", 34000));
		movieList.add(new Movie("사랑의 하츄핑", "하츄핑", 40000));
		movieList.add(new Movie("명탐정 코난 - 100만 달러의 펜타그램", "고쇼", 30000));
		movieList.add(new Movie("인셉션", "디카프리오", 20000));
		movieList.add(new Movie("영화5", "저자5", 23000));
		
		// 정렬 전
		System.out.println("* 정렬 전");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("-----------------------------------------");
		
		// 정렬
		// * Movie 클래스에서 구현한 compareTo() 메소드의 비교기준에 따라서 정렬
		Collections.sort(movieList);
		
		// 정렬 후
		System.out.println("* 정렬 후");
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println("-----------------------------------------");
	}
}
