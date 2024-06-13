package org.ella.day13.collection.music.controller;

import java.util.List;
import java.util.Map;

import org.ella.day13.collection.music.model.ManageMusic;
import org.ella.day13.collection.music.model.Music;
import org.ella.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		ManageMusic mng = new ManageMusic();
		ViewMusic view = new ViewMusic();
		끝: while (true) {
			int choice = view.printMenu();
			Music music = null;
			List<Music> mList = null;
			String name = "";
			int index = 0;
			switch (choice) {
				case 1:
					music = view.addMusicList();
					mng.registerMusic(music);
					break;
				case 2: // 첫위치에 추가
					music = view.addMusicList();
					mng.registerMusicFirst(music);
					break;
				case 3:
					mList = mng.selectAllMusic();
					if (mList.size() > 0)
						view.displayMusic(mList);
					else
						view.displayMsg("정보가 존재하지 않습니다.");
					break;
				case 4:
					// 곡을 입력 받음
					String title = view.inputTitle("검색");
					// mList에서 찾아서
					mList = mng.searchOneByTitle(title);
					// View를 이용하여 출력
					if (mList != null)
						view.displayMusic(mList);
					else
						view.displayMsg("검색결과가 없습니다.");
					break;
				case 5:
					// 수정할 곡명 입력
					name = view.inputTitle("수정");
					// 수정할 위치 입력받기
					index = mng.searchIndexByName(name);
					// 수정할 곡 찾기
					music = mng.searchMusicByTitle(name);
					// 수정할 정보 입력받기
					music = view.modifyMusic(music);
					// set메소드 써서 인덱스 값과 곡 정보 변경
					mng.modifyMusic(index, music);
//					Map<String, Object> result = mng.searchModifyMusic(title);
//					music = view.modifyMusic((Music) result.get("music"));
//					mng.modifyMusic((int) result.get("index"), music);
					break;
				case 6:
					name = view.inputTitle("삭제");
					// 삭제할 위치
					music = mng.searchMusicByTitle(name);
					if(music != null) {
						index = mng.searchIndexByName(name);
						// 해당값 삭제
						mng.deleteMusic(index);						
					}
					break;
				case 7 : 
					mng.sortByTitleASC();
					break;
				case 8 : 
					mng.sortByTitleDESC();
					break;
				case 9 : 
					mng.sortBySingerASC();
					break;
				case 10 : 
					mng.sortBySingerDESC();
					break;
				case 0:
					view.displayMsg("프로그램을 종료합니다.");
				default:
					view.displayMsg("메뉴를 잘못 선택하셨습니다.");
					break;

			}
		}
	}
}
