package org.ella.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageMusic {

	private List<Music> mList;

	public ManageMusic() {
		mList = new ArrayList<Music>();
	}

	// 맨 뒤에 곡 추가
	public void registerMusic(Music music) {
		mList.add(music);
	}

	// 맨 앞에 곡 추가
	public void registerMusicFirst(Music music) {
		mList.add(0, music);
	}

	// 모든 곡 조회
	public List<Music> selectAllMusic() {
		return mList;
	}

	// 곡명으로 검색
	public List<Music> searchOneByTitle(String title) {
		if (title != null) {
			List<Music> searchList = new ArrayList<Music>();
			for (Music music : mList) {
				if (title.equals(music.getTitle())) {
					searchList.add(music);
				}
			}
			return searchList;
		}
		return null;
	}

	// 곡명으로 인덱스 검색
	// 해당하는 위치(인덱스)에 있는 값을 교체하기 위해서 입력받음
	// 첫번째에 있는 값 교체하려면 1이라는 순서를 입력받아야 교체하지?
	public int searchIndexByName(String name) {
		if (name != "" && name != null) {
			int index = 0;
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	// 곡명으로 검색
	public Music searchMusicByTitle(String name) {
		if (name != "" && name != null) {
			for (Music music : mList) {
				if (name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	// 곡 정보 수정
	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}

	// 곡 삭제
	public void deleteMusic(int index) {
		mList.remove(index);
	}

	// 제목으로 오름차순 정렬
	public void sortByTitleASC() {
		// List<String> strList = new ArrayList<String>();
		// strList.add("김만우");
		// strList.add("강진형");
		// strList.add("박은진");
		// Collections.sort(strList); // 기본 오름차순 정렬
		// 숫자 > 영어 > 한글
		Collections.sort(mList);
		// collection - list, set, map 크기 - size()
//	int nums [] = {4, 3, 2, 1};
//	for(int i = 0; i < mList.size()-1; i++) {
//		for(int j = 0; j < (mList.size()-1)-i; j++) {
//			// 버블 정렬의 특징 - 오른쪽부터 정렬됨, 비교횟수 줄어듬
//			Music mOne = mList.get(j);
//			Music mTwo = mList.get(j+1);
//			// 문제점 : 객체비교는 부등호로는 무리
//			// 비교해야 하는 것은 곡명(title)
//			// title을 서로 비교하여 늦은 순서인 경우 교체
//			// 문자열 비교는 equals()
//			// 비교했을 때 왼쪽이 크면 맨 오른쪽으로 보내라 -> 오른쪽 큰놈들만 쌓임 -> 오름차순 정렬
//			if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
//				// 인수 문자열이 이 문자열과 같으면 0
//				// 인수 문자열이 이 문자열보다 크면 1
//				// 인수 문자열이 이 문자열보다 작으면 -1			
//				mList.set(j, mTwo);
//				mList.set(j+1, mOne);
//			}
//		}
//	}
	}
	
	// 제목으로 내림차순 정렬
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
//		for (int i = 0; i < mList.size() - 1; i++) {
//			for (int j = 0; j < mList.size() - 1; j++) {
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j + 1);
//				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 
//				// -> 오른쪽에 작은것만 쌓임 -> 내림차순 정렬
//				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
//					mList.set(j, mTwo);
//					mList.set(j + 1, mOne);
//				}
//			}
//		}
	}

	// 가수명으로 오름차순
		public void sortBySingerASC() {
			for (int i = 0; i < mList.size() - 1; i++) {
				for (int j = 0; j < mList.size() - 1; j++) {
					Music mOne = mList.get(j);
					Music mTwo = mList.get(j + 1);
					if (mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
						mList.set(j, mTwo);
						mList.set(j + 1, mOne);
					}
				}
			}
		}

		// 가수명으로 내림차순
		public void sortBySingerDESC() {
			for (int i = 0; i < mList.size() - 1; i++) {
				for (int j = 0; j < mList.size() - 1; j++) {
					Music mOne = mList.get(j);
					Music mTwo = mList.get(j + 1);
					if (mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
						mList.set(j, mTwo);
						mList.set(j + 1, mOne);
					}
				}
			}
		}

}
