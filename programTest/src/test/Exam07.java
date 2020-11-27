package test;

import java.util.List;
import java.util.Scanner;

//컬렉션/DB를 활용하여 입력값 등록/수정/삭제/전체목록 확인하는 프로그램
// 전체 목록
//메뉴 선택하기 완.
//
public class Exam07 {
	static Scanner scn = new Scanner(System.in);
	static Exam06[] aa = new Exam06[100];

	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.전체목록 2.등록 3.수정 4.삭제 5.종료");
			System.out.println("--------------------------");
			System.out.println("선택: ");
			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				showList();
			} else if (selectNo == 2) {
				addList();
			} else if (selectNo == 3) {
				updateList();
			} else if (selectNo == 4) {
				deleteList();
			} else if (selectNo == 5) {
				break;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	}// end of main

	// 1.전체리스트
	public static void showList() {
		for (int i = 0; i < aa.length; i++) {
			if (aa[i] != null) {
				aa[i].showInfo();
			}
		}
	}

	// 2.등록
	public static void addList() {
		System.out.println("책 번호: ");
		int no = scn.nextInt();
		scn.nextLine();
		System.out.println("책 이름: ");
		String bookName = scn.nextLine();
		System.out.println("책 저자: ");
		String bookWriter = scn.nextLine();
		Exam06 lbr = new Exam06(no, bookName, bookWriter);

		insertList(lbr);
	}

	// 3.수정
	public static void updateList() {
		searchList();

		System.out.println("수정하고싶은 번호: ");
		int no = scn.nextInt();
		scn.nextLine();
		System.out.println("수정하고싶은 이름: ");
		String bookName = scn.nextLine();
		System.out.println("수정하고싶은 저자: ");
		String bookWriter = scn.nextLine();

		Exam06 lbr = new Exam06(no, bookName, bookWriter);

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] != null) {
				aa[i].setNo(no);
				aa[i].setTitle(bookName);
				aa[i].setName(bookWriter);
				break;
			}
		}
		System.out.println("수정되었습니다.");
	}

	// 4.삭제
	public static void deleteList() {

		System.out.println("삭제할 책 번호: ");
		int no = scn.nextInt();

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] != null) {
				if (no == (aa[i].getNo())) {
					aa[i] = null;
				}
			}
		}
		System.out.println("삭제되었습니다.");
	}

	// 조회
	public static void searchList() {
		System.out.println("수정할 책번호: ");
		scn.nextLine();
		String search = scn.nextLine();

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] != null) {
				if (search.equals(aa[i].getNo())) {
					aa[i].showInfo();
					break;
				}
			}
		}

	}

	// 입력용
	public static void insertList(Exam06 a) {

		for (int i = 0; i < aa.length; i++) {
			if (aa[i] == null) {
				aa[i] = a;
				break;
			} // 한건 입력 후 나옴
		}
	}

}// end of class