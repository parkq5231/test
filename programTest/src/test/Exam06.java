package test;
//도서정보를 등록하는  프로그램.

//필드 생성자 메소드
public class Exam06 {
	// 필드
	private int no;
	private String title;

	private String name;

	// 생성자
	public Exam06() {
	}

	public Exam06(int no, String title, String name) {
		super();
		this.no = no;
		this.title = title;
		this.name = name;
	}
	// 메소드1

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메소드2

	public void showInfo() {
		System.out.println("책 번호:" + no + " 책 이름: " + title + " 작성자: " + name);
	}

}// end of class